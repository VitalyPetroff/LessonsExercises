import Model.Account;
import Model.CartOfAccount;
import Model.Good;
import Model.Shop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ShopService implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Shop.class);
    private Shop shop;
    private ShopDao shopDao;

    public ShopService(){
//        try {
//            FileInputStream fis = new FileInputStream("shopInfo.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            shop = (Shop)ois.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            shop = new Shop();
//        }
        shopDao = new ShopDao("jsonShop.json");
        shop = shopDao.read();
    }

    public void serialize(){
//        try {
//            FileOutputStream fos = new FileOutputStream("shopInfo.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(shop);
//            oos.flush();
//            oos.close();
//        } catch (Exception e) {
//            LOGGER.error(e.getMessage(), e);
//        }

        shopDao.write(shop);
    }

    public String addGoodToShop(String name, int price, int quantity) {
        String result;
        boolean isShopContainsGood = false;
        Integer goodId = 0;
        // поиск товара в магазине и его добавление
        for (Integer id : shop.mapOfGoods.keySet()) {
            Good good = shop.mapOfGoods.get(id);
            if (good.nameOfGood.equals(name)) {
                Integer initQuantity = shop.mapOfQuantity.get(id);
                shop.mapOfQuantity.put(id, initQuantity + quantity);
                goodId = id;
                isShopContainsGood = true;
                break;
            }
        }
        // создание нового товара, если товар не найден
        if (!isShopContainsGood) {
            goodId = shop.mapOfGoods.size();
            shop.mapOfGoods.put(goodId, new Good(name, price));
            shop.mapOfQuantity.put(goodId, quantity);
        }
        serialize();
        result = "Товар " + goodId +
                " теперь в магазине в количестве " + shop.mapOfQuantity.get(goodId) +
                " по цене " + price;
        return result;
    }

    public String printGoodInfoInShop(Integer goodId){
        String idInfo = "ID:" + goodId;
        String goodInfo = shop.mapOfGoods.get(goodId).toString();
        String quantity = " Количество: " + shop.mapOfQuantity.get(goodId);
        return (idInfo + goodInfo + quantity);
    }

    public Integer addNewAccount(String name) {
        boolean isShopContainAccount = false;
        Integer accountId = 0;
        // проверка наличия аккаунта в магазине
        for (Integer id : shop.mapOfAccounts.keySet()) {
            if (shop.mapOfAccounts.get(id).nameOfAccount.equals(name)){
                System.out.println("Такой аккаунт уже существует!");
                accountId = id;
                isShopContainAccount = true;
                break;
            }
        }
        // добавление нового аккаунта
        if (!isShopContainAccount){
            accountId = shop.mapOfAccounts.size();
            shop.mapOfAccounts.put(accountId, new Account(name));
        }
        serialize();
        return accountId;
    }

    public String getAccountInfo(Integer id){
        String idInfo = "ID:" + id;
        String accountInfo = shop.mapOfAccounts.get(id).toString();
        return (idInfo + accountInfo);
    }

    public String addToCart(Integer accountId, Integer goodId, Integer quantity) {
        String result;
        if (shop.mapOfQuantity.containsKey(goodId)) { // есть ли данный товар в магазине
            Integer quantityInShop = shop.mapOfQuantity.get(goodId);
            if (quantityInShop < quantity) { // в достаточном ли количестве товар
                quantity = quantityInShop;
            }
            CartOfAccount cart = shop.mapOfAccounts.get(accountId).cartOfAccount;
            Integer quantityToCart = quantity;
            if (cart.mapOfQuantity.containsKey(goodId)) {   // был ли товар ранее добавлен в корзину аккаунта
                quantityToCart += cart.mapOfQuantity.get(goodId);
            }
            shop.mapOfQuantity.put(goodId, quantityInShop - quantity); // изменяем количество товара в магазине
            cart.mapOfPrice.put(goodId, shop.mapOfGoods.get(goodId).priceOfGood);
            cart.mapOfQuantity.put(goodId, quantityToCart); // добавляем товар в корзину
            serialize();
            result = "В корзину добавлен товар " + goodId + " в количестве " + quantityToCart;
        } else {
            result = "Такого товара в магазине нет";
        }
        return result;
    }

    public String buyCart(Integer accountId) {
        CartOfAccount cart = shop.mapOfAccounts.get(accountId).cartOfAccount;
        Integer totalPrice = 0;
        for (Integer goodId : cart.mapOfQuantity.keySet()) {
            totalPrice = cart.mapOfQuantity.get(goodId) * cart.mapOfPrice.get(goodId);
        }
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cart.mapOfQuantity.clear();
        cart.mapOfPrice.clear();
        String str = "Сумма покупок составила " + totalPrice + " рублей.";
        serialize();
        return str;
    }
}
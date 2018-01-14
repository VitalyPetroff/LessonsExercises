import Model.Account;
import Model.CartOfAccount;
import Model.Good;
import Model.Shop;
import org.slf4j.LoggerFactory;

import java.io.*;

public class Controller implements Serializable {
    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Shop.class);

    public static Shop readShop(){
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (Shop) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new Shop();
        }
    }

    public void serialize(Shop shop){
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(shop);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public static Integer addGoodToShop(Shop shop, String name, int price, int numOfGood) {
        boolean isShopContainsGood = false;
        Integer goodId = 0;
        // поиск товара в магазине
        for (Integer id : shop.mapOfGoods.keySet()) {
            Good good = shop.mapOfGoods.get(id);
            if (good.nameOfGood.equals(name)) {
                Integer quantity = shop.mapOfQuantity.get(id);
                shop.mapOfQuantity.put(id, quantity + numOfGood);
                goodId = id;
                isShopContainsGood = true;
                break;
            }
        }
        // создание нового товара, если товар не найден
        if (!isShopContainsGood) {
            goodId = shop.mapOfGoods.size();
            shop.mapOfGoods.put(goodId, new Good(name, price));
            shop.mapOfQuantity.put(goodId, numOfGood);
        }
        return goodId;
    }

    public static String getGoodInfo(Shop shop, Integer goodId){
        String idInfo = "ID:" + goodId;
        String goodInfo = shop.mapOfGoods.get(goodId).toString();
        String quantity = " Количество: " + shop.mapOfQuantity.get(goodId);
        return (idInfo + goodInfo + quantity);
    }

    public static Integer addNewAccount(Shop shop, String name) {
        boolean isShopContainAccount = false;
        Integer accountId = 0;
        // проверка наличия аккаунта в магазине
        for (Integer id : shop.mapOfAccounts.keySet()) {
            if (shop.mapOfAccounts.get(id).nameOfAccount.equals(name)){
                System.out.println("Такой ");
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
        return accountId;
    }

    public static String getAccountInfo(Shop shop, Integer id){
        String idInfo = "ID:" + id;
        String accountInfo = shop.mapOfAccounts.get(id).toString();
        return (idInfo + accountInfo);
    }

    public static void addToCart(Shop shop, Integer accountId, Integer goodId, Integer quantity) {
        if (shop.mapOfQuantity.containsKey(goodId)) { // есть ли данный товар в магазине
            Integer quantityOfGoodInShop = shop.mapOfQuantity.get(goodId);
            if (quantityOfGoodInShop < quantity) { // в достаточном ли количестве товар
                quantity = quantityOfGoodInShop;
            }
            CartOfAccount cart = shop.mapOfAccounts.get(accountId).cartOfAccount;
            if (cart.mapOfQuantity.containsKey(goodId)) {   // был ли товар ранее добавлен в корзину аккаунта
                quantity += cart.mapOfQuantity.get(goodId);
            }
            shop.mapOfQuantity.put(goodId, quantityOfGoodInShop - quantity); // изменяем количество товара в магазине
            cart.mapOfPrice.put(goodId, shop.mapOfGoods.get(goodId).priceOfGood);
            cart.mapOfQuantity.put(goodId, quantity); // добавляем товар в корзину
        }
    }

    public static String buyCart(Shop shop, Integer accountId) {
        CartOfAccount cart = shop.mapOfAccounts.get(accountId).cartOfAccount;
        Integer totalPrice = 0;
        for (Integer goodId : cart.mapOfQuantity.keySet()) {
            totalPrice = cart.mapOfQuantity.get(goodId) * cart.mapOfPrice.get(goodId);
        }
        cart.mapOfQuantity.clear();
        cart.mapOfPrice.clear();
        String str = "Сумма покупок составила " + totalPrice + " рублей.";
        return str;
    }
}
import Model.Account;
import Model.CartOfAccount;
import Model.Good;
import Model.Shop;

public class Controller {

    public static void addGoodToShop(Shop shop, String name, int price, int numOfGood) {
        boolean isShopContainsGood = false;
        // поиск товара в магазине
        for (Integer id : shop.mapOfGoods.keySet()) {
            Good good = shop.mapOfGoods.get(id);
            if (good.nameOfGood.equals(name)) {
                Integer quantity = shop.mapOfQuantity.get(id);
                shop.mapOfQuantity.put(id, quantity + numOfGood);
                isShopContainsGood = true;
                break;
            }
        }
        // создание нового товара, если товар не найден
        if (!isShopContainsGood) {
            Integer id = shop.mapOfGoods.size();
            shop.mapOfGoods.put(id, new Good(name, price));
            shop.mapOfQuantity.put(id, numOfGood);
        }
    }

    public static void addNewAccount(Shop shop, String name) {
        boolean isShopContainAccount = false;
        // проверка наличия аккаунта в магазине
        for (Integer id : shop.mapOfAccounts.keySet()) {
            if (shop.mapOfAccounts.get(id).nameOfAccount.equals(name)){
                System.out.println("Error");
                isShopContainAccount = true;
                break;
            }
        }
        // добавление нового аккаунта
        if (!isShopContainAccount){
            Integer quantityOfAccounts = shop.mapOfAccounts.size();
            shop.mapOfAccounts.put(quantityOfAccounts, new Account(name));
        }
    }

    public static void addToCart(Shop shop, Integer accountId, Integer goodId, Integer quantityOfGood) {
        if (shop.mapOfQuantity.containsKey(goodId)) { // есть ли данный товар в магазине
            Integer quantityOfGoodInShop = shop.mapOfQuantity.get(goodId);
            if (quantityOfGoodInShop >= quantityOfGood) { // в достаточном ли количестве товар
                CartOfAccount cart = shop.mapOfAccounts.get(accountId).cartOfAccount;
                shop.mapOfQuantity.put(goodId, quantityOfGoodInShop - quantityOfGood); // убираем товар из магазина
                if (cart.mapOfCart.containsKey(goodId)) {   // был ли товар ранее добавлен в корзину аккаунта
                    quantityOfGood += cart.mapOfCart.get(goodId);
                }
                cart.mapOfCart.put(goodId, quantityOfGood); // добавляем товар в корзину
            }
        }
    }

    public static void buyCart(Shop shop, Integer accountId) {
        shop.mapOfAccounts.get(accountId).cartOfAccount.mapOfCart.clear();
    }

    public static String getGoodInfo(Shop shop, Integer id){
        String idInfo = "ID:" + id;
        String goodInfo = shop.mapOfGoods.get(id).toString();
        String quantity = " Количество: " + shop.mapOfQuantity.get(id);
        return (idInfo + goodInfo + quantity);
    }

    public static String getAccountInfo(Shop shop, Integer id){
        String idInfo = "ID:" + id;
        String accountInfo = shop.mapOfAccounts.get(id).toString();
        return (idInfo + accountInfo);
    }
}
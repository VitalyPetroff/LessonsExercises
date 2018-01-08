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
                Integer quantityOfGood = shop.mapOfQuantity.get(id);
                shop.mapOfQuantity.put(id, quantityOfGood + numOfGood);
                isShopContainsGood = true;
                break;
            }
        }
        // создание нового товара, если товар не найден
        if (!isShopContainsGood) {
            Integer goodId = shop.mapOfGoods.size();
            shop.mapOfGoods.put(goodId, new Good(name, price));
            shop.mapOfQuantity.put(goodId, numOfGood);
        }
    }

    public static void addNewAccount(Shop shop, String nameOfAccount) {
        boolean isShopContainAccaount = false;
        for ()
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

    public static Good getGoodInfo(Shop shop, Integer id){
        return shop.mapOfGoods.get(id);
    }

    public static Account getAccountInfo(Shop shop, Integer id){
        return shop.mapOfAccounts.get(id);
    }
}
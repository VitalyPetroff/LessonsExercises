import Model.Account;
import Model.CartOfAccount;
import Model.Shop;

public class Controller {

    public static void addGoodToShop(Shop shop, int goodId, int numOfGood) {
        Integer quantityInShop = shop.mapOfQuantity.get(goodId);
        if (quantityInShop == null) {
            shop.mapOfQuantity.put(goodId, numOfGood);
        } else {
            shop.mapOfQuantity.put(goodId, (quantityInShop + numOfGood));
        }
    }

    public static void addNewAccount(Shop shop, String nameOfAccount) {
        Integer quantityOfAccounts = shop.mapOfAccounts.size();
        if (quantityOfAccounts == 0) {
            shop.mapOfAccounts.put(quantityOfAccounts, new Account(nameOfAccount));
        } else {
            shop.mapOfAccounts.put(quantityOfAccounts + 1, new Account(nameOfAccount));
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
}
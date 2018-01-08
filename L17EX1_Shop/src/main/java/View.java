import Model.Account;
import Model.CartOfAccount;
import Model.Shop;

import java.util.Map;

public class View {

    public static void printGoodInfo(String goodInfo){
        System.out.println(goodInfo);
    }

    public static void printAccountInfo(String accountInfo){
        System.out.println(accountInfo);
    }

    public static void printGoodsInCart(Shop shop, Integer accountId) {
        CartOfAccount cart = shop.mapOfAccounts.get(accountId).cartOfAccount;
        int quantityGoodsInCart = shop.mapOfAccounts.get(accountId).cartOfAccount.mapOfCart.size();
        if (quantityGoodsInCart > 0) {
            for (Integer goodId : cart.mapOfCart.keySet()) {
                System.out.println("ID товара: " + goodId + " кол-во в корзине: " + cart.mapOfCart.get(goodId));
            }
        } else {
            System.out.println("Корзина данного аккаунта пуста");
        }
    }
}
import Model.CartOfAccount;
import Model.Shop;

public class View {

    public static void printGoodsId(Shop shop) {
        for (Integer id : shop.mapOfQuantity.keySet()) {
            System.out.println(id + " кол-во: " + shop.mapOfQuantity.get(id));
        }
    }

    public static void printAccountsId(Shop shop) {
        for (Integer id : shop.mapOfAccounts.keySet()) {
            System.out.println(id + " Имя аккаунта: " + shop.mapOfAccounts.get(id).nameOfAccount);
        }
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

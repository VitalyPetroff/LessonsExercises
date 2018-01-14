import Model.CartOfAccount;
import Model.Shop;

public class View {

    public static void printGoodInfo(String goodInfo){
        System.out.println(goodInfo);
    }

    public static void printAccountInfo(String accountInfo){
        System.out.println(accountInfo);
    }

    public static void printCartInfo(Shop shop, Integer accountId) {
        CartOfAccount cart = shop.mapOfAccounts.get(accountId).cartOfAccount;
        int quantityGoodsInCart = shop.mapOfAccounts.get(accountId).cartOfAccount.mapOfQuantity.size();
        if (quantityGoodsInCart > 0) {
            for (Integer goodId : cart.mapOfQuantity.keySet()) {
                System.out.println("ID: " + goodId +
                        " кол-во в корзине: " + cart.mapOfQuantity.get(goodId) +
                        " цена: " + cart.mapOfPrice.get(goodId));
            }
        } else {
            System.out.println("Корзина аккаунта " + accountId + " пуста");
        }
    }
}
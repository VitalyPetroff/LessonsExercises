import Model.Good;
import Model.Shop;

import java.util.HashMap;
import java.util.Map;

public class AppMain {

    public static void main(String[] args) {

        Map<Integer, Good> mapOfGood = new HashMap<>(); // <ID, товар>
        createMapOfGoods(mapOfGood);

        Shop shop = new Shop();

        Controller.addGoodToShop(shop, 1, 6);
        Controller.addGoodToShop(shop, 2, 6);
        Controller.addGoodToShop(shop, 3, 2);
        View.printGoodsId(shop);

        Controller.addNewAccount(shop, "Вася");
        Controller.addNewAccount(shop, "Петя");
        Controller.addNewAccount(shop, "Коля");
        View.printAccountsId(shop);

        Controller.addToCart(shop, 2, 1, 1);
        Controller.addToCart(shop, 2, 1, 3);
        View.printGoodsInCart(shop, 2);
        View.printGoodsId(shop);

        Controller.buyCart(shop, 2);
        View.printGoodsInCart(shop, 2);
    }

    private static void createMapOfGoods(Map mapOfGoods) {
        mapOfGoods.put(0, new Good("Одежда", 20));
        mapOfGoods.put(1, new Good("Игрушки", 15));
        mapOfGoods.put(2, new Good("Еда", 5));
        mapOfGoods.put(3, new Good("Телефон", 50));
    }
}

/*
public static void main(String[] args) {
        get("/getGoods", (request, response) -> {
            return ctrller.getGoodsList();
        });
        get("/addGoodToCart", (request, response) -> {
            int accountId = Integer.parseInt(request.queryParams("accountId"));
            int goodId = Integer.parseInt(request.queryParams("cartId"));
            ctrller.addGoodToCart(accountId, goodId);
            return "ok";
        });
        get("/buyCart", (request, response) -> {
            int accountId = Integer.parseInt(request.queryParams("accountId"));
            ctrller.buyCart(accountId);
            return "ok";
        });

        get("/addGoodToShop", (request, response) -> {
            int goodId = Integer.parseInt(request.queryParams("cartId"));
            ctrller.addGoodToShop(goodId);
            return "ok";
        });
 */

/*
    /addToCart?accountId=1&goodId=8
    /buyCart?accountId=1
    /addGood?goodId=8
 */
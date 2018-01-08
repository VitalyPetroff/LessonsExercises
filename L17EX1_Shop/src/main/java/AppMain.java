import Model.Shop;

public class AppMain {

    public static void main(String[] args) {

        Shop shop = new Shop();

        Controller.addGoodToShop(shop, "Одежда", 20, 10);
        Controller.addGoodToShop(shop, "Игрушки", 15, 6);
        Controller.addGoodToShop(shop, "Еда", 5, 20);
        Controller.addGoodToShop(shop, "Телефон", 50, 5);
        Controller.addGoodToShop(shop, "Ноутбук", 100, 5);
        for (Integer id : shop.mapOfGoods.keySet()){
            View.printGoodInfo(Controller.getGoodInfo(shop, id));
        }
        View.printGoodInfo(Controller.getGoodInfo(shop, 2));
        System.out.println("===========================");

        Controller.addNewAccount(shop, "Вася");
        Controller.addNewAccount(shop, "Петя");
        Controller.addNewAccount(shop, "Коля");
        for (Integer id : shop.mapOfAccounts.keySet()){
            View.printAccountInfo(Controller.getAccountInfo(shop, id));
        }
        View.printAccountInfo(Controller.getAccountInfo(shop, 1));
        System.out.println("===========================");

        Controller.addToCart(shop, 2, 1, 1);
        View.printGoodsInCart(shop, 2);
        Controller.addToCart(shop, 2, 1, 3);
        View.printGoodsInCart(shop, 2);
        System.out.println("===========================");

//        Controller.buyCart(shop, 2);
//        View.printGoodsInCart(shop, 2);
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
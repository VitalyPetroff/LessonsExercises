import Model.Shop;

import static spark.Spark.get;

public class AppMain {

    public static void main(String[] args) {

        Shop shop = new Shop();

        get("/addGoodToShop", (request, response) -> {
            String nameOfGood = request.queryParams("nameOfGood");
            Integer priceOfGood = Integer.parseInt(request.queryParams("priceOfGood"));
            Integer numberOfGood = Integer.parseInt(request.queryParams("numberOfGood"));
            Integer goodId = Controller.addGoodToShop(shop, nameOfGood, priceOfGood, numberOfGood);
            return Controller.getGoodInfo(shop, goodId);
        });
/*
         /addGoodToShop?nameOfGood="Игрушки"&priceOfGood=15&numberOfGood=6
                        nameOfGood="Одежда"&priceOfGood=20&numberOfGood=10
                        nameOfGood="Продукты"&priceOfGood=5&numberOfGood=20
                        nameOfGood="Телефон"&priceOfGood=50&numberOfGood=5
                        nameOfGood="Ноутбук"&priceOfGood=100&numberOfGood=5
*/
        get("/addNewAccount", ((request, response) -> {
            String nameOfAccount = request.queryParams("nameOfAccount");
            Integer accountId = Controller.addNewAccount(shop, nameOfAccount);
            return Controller.getAccountInfo(shop, accountId);
        }));
/*
        /addNewAccount?nameOfAccount="Вася"
                nameOfAccount="Петя"
                nameOfAccount="Коля"
*/
        get("/addToCart", ((request, response) -> {
            Integer accountId = Integer.parseInt(request.queryParams("accountId"));
            Integer goodId = Integer.parseInt(request.queryParams("goodId"));
            Integer quantity = Integer.parseInt(request.queryParams("quantity"));
            Controller.addToCart(shop, accountId, goodId, quantity);
            return "ОК";
        }));
/*
        /addToCart?accountId=0&goodId=0&quantity=10
*/
        get("/buyCart", ((request, response) -> {
            Integer accountId = Integer.parseInt(request.queryParams("accountId"));
            String str = Controller.buyCart(shop, accountId);
            return str;
        }));
 /*
        /buyCart?accountId=0
  */
    }
}
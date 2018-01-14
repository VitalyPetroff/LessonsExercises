import static spark.Spark.get;

public class AppMain {

    public static void main(String[] args) {

        ShopService controller = new ShopService();

        get("/addGoodToShop", (request, response) -> {
            String name = request.queryParams("name");
            Integer price = Integer.parseInt(request.queryParams("price"));
            Integer quantity = Integer.parseInt(request.queryParams("quantity"));
            String result = controller.addGoodToShop(name, price, quantity);
            return result;
        });

/*
         /addGoodToShop?name="Игрушки"&price=15&quantity=6
                        name="Одежда"&price=20&quantity=10
                        name="Продукты"&price=5&quantity=20
                        name="Телефон"&price=50&quantity=5
                        name="Ноутбук"&price=100&quantity=5
*/
        get("/addNewAccount", ((request, response) -> {
            String name = request.queryParams("nameOfAccount");
            Integer accountId = controller.addNewAccount(name);
            View.printAccountInfo(controller.getAccountInfo(accountId));
            return controller.getAccountInfo(accountId);
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
            controller.addToCart(accountId, goodId, quantity);
//            View.printCartInfo(accountId);
            return controller.printGoodInfoInShop(goodId);
        }));
/*
        /addToCart?accountId=0&goodId=0&quantity=10
*/
        get("/buyCart", ((request, response) -> {
            Integer accountId = Integer.parseInt(request.queryParams("accountId"));
            String str = controller.buyCart(accountId);
            return str;
        }));
 /*
        /buyCart?accountId=0
  */
    }
}
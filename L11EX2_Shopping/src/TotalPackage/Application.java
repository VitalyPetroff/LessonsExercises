package TotalPackage;

import TotalPackage.shop.*;

public class Application {

    // максимально возможное количество товаров в магазине
    private static final int MAX_FOODS_IN_SHOP = 10;
    private static final int MAX_CLOTHES_IN_SHOP = 10;
    private static final int MAX_BOOKS_IN_SHOP = 10;

    private static final int QUANTITY_OF_BUYERS = 5; // количество покупателей
    // максимально возможное количество товаров в списке желаний покупателя
    private static final int MAX_FOODS_FOR_MAN = 5;
    private static final int MAX_CLOTHES_FOR_MAN = 5;
    private static final int MAX_BOOKS_FOR_MAN = 5;

    public static void main(String[] args) {

        formShopList(); // формируем список товаров в магазине

        // создаём покупателей
        Man[] buyers = new Man[QUANTITY_OF_BUYERS];
        for (int i = 0; i < QUANTITY_OF_BUYERS; i++) {
            buyers[i] = new Man();
        }

        formBuyersWishLists(buyers); // формируем списки желаемых товаров у каждого покупателя
        shoppingOfBuyers(buyers); // покупка товаров каждым покупателем
        printInfo(buyers);  // вывод инфы о покупателях
        consumeOfAllBuyers(buyers); // использование товаров
        System.out.println("\nПОСЛЕ ИСПОЛЬЗОВАНИЯ КУПЛЕННЫХ ТОВАРОВ:");
        printInfo(buyers);  // вывод инфы о покупателях
    }

    public static void formShopList() {
        Shop.goodsOfShop = ListOfGoods.formList(Shop.goodsOfShop,
                MAX_FOODS_IN_SHOP,
                MAX_CLOTHES_IN_SHOP,
                MAX_BOOKS_IN_SHOP);
//        System.out.println("В МАГАЗИНЕ ЕСТЬ:");
//        ListOfGoods.printList(Shop.goodsOfShop);
    }

    public static void formBuyersWishLists(Man[] buyers) {
        for (Man man : buyers) {
            man.wishGoods = ListOfGoods.formList(man.wishGoods,
                    (int) (Math.random() * MAX_FOODS_FOR_MAN),
                    (int) (Math.random() * MAX_CLOTHES_FOR_MAN),
                    (int) (Math.random() * MAX_BOOKS_FOR_MAN));
//            System.out.println("ПОКУПАТЕЛЬ ЖЕЛАЕТ:");
//            ListOfGoods.printList(man.wishGoods);
        }
    }

    public static void shoppingOfBuyers(Man[] buyers) {
        int numberOfbuyer = 1;
        for (Man buyer : buyers) {
            System.out.println("В МАГАЗИН ЗАШЕЛ ПОКУПАТЕЛЬ №" + numberOfbuyer);
            for (Good good : buyer.wishGoods) {
                try {
                    Shop.shopping(buyer, good);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            String message = "В КОРЗИНЕ У ПОКУПАТЕЛЯ №" + numberOfbuyer +
                    " НАХОДИТСЯ " + buyer.purchasedGoods.size() + " ТОВАРА";
            System.out.println(message);
            message = "В МАГАЗИНЕ ОСТАЛОСЬ " + Shop.goodsOfShop.size() + " ТОВАРОВ" + "\n";
            System.out.println(message);
            numberOfbuyer++;
        }
    }

    public static void printInfo(Man[] buyers) {
        System.out.println("ИНФА О ПОКУПАТЕЛЯХ:");
        for (Man buyer : buyers) {
            System.out.println(buyer.toString());
        }
    }

    public static void consumeOfAllBuyers(Man[] buyers){
        for (Man buyer : buyers) {
            buyer.consumeAll();
        }
    }
}
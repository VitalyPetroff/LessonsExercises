package TotalPackage;

import TotalPackage.shop.*;

public class Application {

    // максимально возможное количество товаров в магазине
    private static final int MAX_FOODS_IN_SHOP = 15;
    private static final int MAX_CLOTHES_IN_SHOP = 15;
    private static final int MAX_BOOKS_IN_SHOP = 15;

    private static final int MAX_FOODS_FOR_MAN = 5;
    private static final int MAX_CLOTHES_FOR_MAN = 5;
    private static final int MAX_BOOKS_FOR_MAN = 5;

    public static void main(String[] args) {
        // формируем список товаров в магазине
        System.out.println("Магазин");
        FormerList.formOfGoodsList(Shop.goodsOfShop,
                (int)(Math.random() * MAX_FOODS_IN_SHOP),
                (int)(Math.random() * MAX_CLOTHES_IN_SHOP),
                (int)(Math.random() * MAX_BOOKS_IN_SHOP));


        Man[] buyers = new Man[5];
        for (Man man : buyers){
            System.out.println("чел");
            FormerList.formOfGoodsList(man.goodsOfMan,
                    (int)(Math.random() * MAX_FOODS_FOR_MAN),
                    (int)(Math.random() * MAX_CLOTHES_FOR_MAN),
                    (int)(Math.random() * MAX_BOOKS_FOR_MAN));
        }
    }
}
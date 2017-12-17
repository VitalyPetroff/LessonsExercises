package TotalPackage;

import TotalPackage.shop.*;

public class Application {

    // максимально возможное количество товаров в магазине
    private static final int MAX_FOODS_IN_SHOP = 15;
    private static final int MAX_CLOTHES_IN_SHOP = 15;
    private static final int MAX_BOOKS_IN_SHOP = 15;

    private static final int QUANTITY_OF_BUYERS = 5; // количество покупателей
    // максимально возможное количество товаров в списке желаний покупателя
    private static final int MAX_FOODS_FOR_MAN = 5;
    private static final int MAX_CLOTHES_FOR_MAN = 5;
    private static final int MAX_BOOKS_FOR_MAN = 5;

    public static void main(String[] args) {
        // формируем список товаров в магазине
        System.out.println("В МАГАЗИНЕ ЕСТЬ:");
        Shop.goodsOfShop = ListOfGoodsFormer.formList(Shop.goodsOfShop,
                MAX_FOODS_IN_SHOP,
                MAX_CLOTHES_IN_SHOP,
                MAX_BOOKS_IN_SHOP);
        ListOfGoodsFormer.printList(Shop.goodsOfShop);

        // формируем списки желаемых товаров у каждого покупателя
        Man[] buyers = new Man[QUANTITY_OF_BUYERS];
        for (int i = 0; i < QUANTITY_OF_BUYERS; i++) {
            buyers[i] = new Man();
        }
        for (Man man : buyers) {
            System.out.println("ПОКУПАТЕЛЬ ЖЕЛАЕТ:");
            man.wishGoods = ListOfGoodsFormer.formList(man.wishGoods,
                    (int) (Math.random() * MAX_FOODS_FOR_MAN),
                    (int) (Math.random() * MAX_CLOTHES_FOR_MAN),
                    (int) (Math.random() * MAX_BOOKS_FOR_MAN));
            ListOfGoodsFormer.printList(man.wishGoods);
        }

//        for(Good good : buyers[0].wishGoods){
//            Shop.shopping(buyers[0], good);
//        }


    }
}
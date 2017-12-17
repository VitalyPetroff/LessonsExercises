package TotalPackage;

import TotalPackage.shop.*;

import java.util.Arrays;

public class Application {

    // исходное количество товаров в магазине
    private static final int QUANTITY_OF_GOODS_IN_SHOP = 15;



    public static void main(String[] args) {
        formOfShopList();
    }

    // формирование списка товаров в магазине
    public static void formOfShopList() {
        Good[] arrOfGoods = new Food[QUANTITY_OF_GOODS_IN_SHOP];
        FoodFormer.arrOfFoodFormer((Food[]) arrOfGoods);
        Shop.goodsOfShop = Arrays.asList(arrOfGoods);

        arrOfGoods = new Clothes[QUANTITY_OF_GOODS_IN_SHOP];

//        ClothesFormer.arrOfClothesFormer((Clothes[]) arrOfGoods);
//        Shop.goodsOfShop = Arrays.asList(arrOfGoods);
//        for (Good good : arrOfGoods){
//            System.out.println(good.toString());
//        }
    }
}

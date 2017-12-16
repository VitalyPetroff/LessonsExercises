package TotalPackage.shop;

import TotalPackage.Man;

import java.util.Arrays;
import java.util.List;

public class Shop {

    private static final List<Good> goodsOfShop = Arrays.asList(new Good(), new Good());

    public static void shopping(Man buyer, Good nameOfGoods) throws IllegalArgumentException, IllegalStateException{
        if (buyer.getMoney() < nameOfGoods.getPriceOfGood()){
            throw IllegalArgumentException("Покупатель не имеет достаточного количества денег");
        }
//        if ( ... ){
//            throw IllegalStateException("Запрашиваемого товара нет в магазине");
//        }
    }
}

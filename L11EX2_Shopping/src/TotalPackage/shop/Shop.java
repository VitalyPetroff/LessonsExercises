package TotalPackage.shop;

import TotalPackage.Man;

import java.util.List;

public class Shop {

    public static List<Good> goodsOfShop;

    public static void shopping(Man buyer, Good nameOfGoods) throws IllegalArgumentException, IllegalStateException{
        if (buyer.getMoney() < nameOfGoods.getPriceOfGood()){
            throw new IllegalArgumentException("На покупку товара не хватает денег!");
        }
        if (!goodsOfShop.contains(nameOfGoods)){
            throw new IllegalStateException("Данный товар в магазине закончился!");
        }
        buyer.purchasedGoods.add(nameOfGoods);
        goodsOfShop.remove(nameOfGoods);
    }
}

package TotalPackage.shop;

import TotalPackage.Man;

import java.util.List;

public class Shop {

    public static List<Good> goodsOfShop;

    public static void shopping(Man buyer, Good wishGood) {
        for (Good good : goodsOfShop) {
            if (good.equals(wishGood)) {
                if (buyer.getMoney() > wishGood.getPriceOfGood()) {
                    buyer.money -= wishGood.priceOfGood;
                    wishGood.ownerOfGood = buyer;
                    buyer.purchasedGoods.add(wishGood);


                    Shop.goodsOfShop.remove(good);
                    return;
                } else {
                    throw new IllegalArgumentException("На покупку товара "
                            + wishGood.toString() + " не хватает денег!");
                }
            }
        }
        throw new IllegalStateException("Товар "
                + wishGood.toString() + " в магазине закончился !");
    }
}




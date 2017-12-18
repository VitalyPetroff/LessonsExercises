package TotalPackage.shop;

import TotalPackage.Man;

import java.util.List;

public class Shop {

    public static List<Good> goodsOfShop;

    public static void shopping(Man buyer, Good wishGood) {
        for (Good good : goodsOfShop) {
            if (good.equals(wishGood)) {
                if (buyer.getMoney() > wishGood.getPriceOfGood()) {
                    buyer.purchasedGoods.add(wishGood);
                    buyer.money -= wishGood.priceOfGood;
                    Shop.goodsOfShop.remove(good);
                    return;
                } else {
                    throw new IllegalArgumentException("НА ПОКУПКУ ТОВАРА "
                            + wishGood.toString() + " НЕ ХВАТАЕТ ДЕНЕГ!");
                }
            }
        }
        throw new IllegalStateException("ТОВАР "
                + wishGood.toString() + "  В МАГАЗИНЕ ЗАКОНЧИЛСЯ!");
    }
}




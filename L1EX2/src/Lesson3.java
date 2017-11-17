public class Lesson3 {

    private static int Pmax = 27;
    private static int shopAVolume;
    private static int shopBVolume;
    private static int shopCVolume;
    private static int shopAPrice = 2;
    private static int shopBPrice = 1;
    private static int shopCPrice = 3;

    public static void main(String[] args) {
        int earnedMoney = 0;
        int producedGoods = produceGoods();
        int goodsCount = producedGoods;

        int goodsForFirstShop = getGoodsForShop(1);
        goodsCount -= goodsForFirstShop;
        int goodsForSecondShop = getGoodsForShop(2);
        goodsCount -= goodsForSecondShop;
        int goodsForThirdShop = getGoodsForShop(3);
        goodsCount -= goodsForThirdShop;


        earnedMoney += sellGoods(goodsForFirstShop, 1);
        earnedMoney += sellGoods(goodsForSecondShop, 2);
        earnedMoney += sellGoods(goodsForThirdShop, 3);


        int soldGoods = producedGoods - goodsCount;
        printReport(soldGoods, earnedMoney);
    }

    public static int produceGoods(){
        int volumeOfGoods;
        volumeOfGoods = (int) (Math.random() * Pmax) + 3;
        shopAVolume = (int)(volumeOfGoods * 0.5);
        shopBVolume = (int)(volumeOfGoods * 0.3);
        shopCVolume = volumeOfGoods - shopAVolume - shopBVolume;
        System.out.println("Завод выпустил " + volumeOfGoods + " продукции");
        return volumeOfGoods;
    }

    public static int getGoodsForShop(int shopNumber){
        int shopVolume = 0;
        switch (shopNumber){
            case 1:
                shopVolume = shopAVolume;
                break;
            case 2:
                shopVolume = shopBVolume;
                break;
            case 3:
                shopVolume = shopCVolume;
                break;
        }
        return shopVolume;
    }

    public static int sellGoods(int countToSell, int shopNumber){
        int price = 0;
        int money;

        switch (shopNumber){
            case 1:
                price = shopAPrice;
                break;
            case 2:
                price = shopBPrice;
                break;
            case 3:
                price = shopCPrice;
                break;
        }
        money = countToSell * price;
        System.out.println("Магазин купил " + countToSell + " на сумму " + money + " (цена за штуку: " + price + " )");
        return money;
    }

    public static void printReport(int soldGoodsCount, int earnedMoney){
        float middlePrice;
        middlePrice = (float) earnedMoney / soldGoodsCount;
        System.out.println("Завод продал " + soldGoodsCount + " на сумму " + earnedMoney +
                ". Средняя цена за штуку " + middlePrice);
    }
}
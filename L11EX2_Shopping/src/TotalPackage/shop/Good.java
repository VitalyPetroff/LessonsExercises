package TotalPackage.shop;

import TotalPackage.Man;

public abstract class Good {

    private String nameofGood;
    private float priceOfGood;
    private Man ownerOfGood;

    protected Good(String nameofGoods){
        this.nameofGood = nameofGood;
    }

    public abstract void consume();

    public float getPriceOfGood() {
        return priceOfGood;
    }
}

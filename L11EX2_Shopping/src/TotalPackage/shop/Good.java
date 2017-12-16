package TotalPackage.shop;

import TotalPackage.Man;

public abstract class Good {

    protected String nameofGood;
    protected float priceOfGood;
    protected Man ownerOfGood;
    protected int factorOfGood;

    protected Good(String nameofGoods){
        this.nameofGood = nameofGood;
    }

    public abstract void consume();

    public float getPriceOfGood() {
        return priceOfGood;
    }
}

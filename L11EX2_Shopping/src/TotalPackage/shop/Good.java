package TotalPackage.shop;

import TotalPackage.Man;

public abstract class Good {

    private String nameOfGood;
    protected float priceOfGood;
    protected Man ownerOfGood;
    protected int factorOfGood;

    protected Good(String nameofGood){
        this.nameOfGood = nameofGood;
    }

    public abstract void consume();

    public float getPriceOfGood() {
        return priceOfGood;
    }


    public String toString(){
        String str ="Name = " + nameOfGood + " price = " + priceOfGood + " factor = " + factorOfGood;
        return str;
    }
}
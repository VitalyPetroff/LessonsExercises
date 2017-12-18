package TotalPackage.shop;

public class Clothes extends Good {

    public Clothes(String nameOfGood, int factorOfGood, float priceOfGood) {
        super(nameOfGood);
        this.factorOfGood = factorOfGood;
        this.priceOfGood = priceOfGood;
    }

    public void consume(){
        ownerOfGood.charisma += factorOfGood;
    }
}
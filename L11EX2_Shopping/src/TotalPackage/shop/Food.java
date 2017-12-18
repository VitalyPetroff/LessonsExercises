package TotalPackage.shop;

public class Food extends Good {

    public Food(String nameOfGood, int factorOfGood, float priceOfGood){
        super(nameOfGood);
        this.factorOfGood = factorOfGood;
        this.priceOfGood = priceOfGood;
    }

    public void consume(){
        ownerOfGood.force += factorOfGood;
    }
}

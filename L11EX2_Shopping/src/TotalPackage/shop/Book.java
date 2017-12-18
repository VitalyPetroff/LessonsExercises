package TotalPackage.shop;

public class Book extends Good {

    public Book(String nameOfGood, int factorOfGood, float priceOfGood) {
        super(nameOfGood);
        this.factorOfGood = factorOfGood;
        this.priceOfGood = priceOfGood;
    }

    public void consume(){
        ownerOfGood.intellect += factorOfGood;
    }
}
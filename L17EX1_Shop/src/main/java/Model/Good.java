package Model;

public class Good {

    public String nameOfGood;
    public int priceOfGood;

    public Good(String nameOfGood, int priceOfGood) {
        this.nameOfGood = nameOfGood;
        this.priceOfGood = priceOfGood;
    }

    @Override
    public String toString() {
        String str = " наименование: " + nameOfGood + " цена: " + priceOfGood;
        return str;
    }
}
package Model;

import java.io.Serializable;

public class Good implements Serializable{

    public String nameOfGood;
    public int priceOfGood;

    public Good() {
    }

    public Good(String nameOfGood, int priceOfGood) {
        this.nameOfGood = nameOfGood;
        this.priceOfGood = priceOfGood;
    }

    @Override
    public String toString() {
        String str = " Наим.: " + nameOfGood + " Цена: " + priceOfGood;
        return str;
    }
}
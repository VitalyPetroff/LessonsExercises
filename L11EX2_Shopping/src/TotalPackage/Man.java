package TotalPackage;

import TotalPackage.shop.Good;

import java.util.List;

public class Man {

    private String name = "Петров";
    private int force = 1;
    private int charisma = 1;
    private int intellect = 1;
    private float money = 100;
//    private static final List<Goods> goodsOfMan = new listOfGoods;

    public String toString(){
        String str = "Имя: " + name +
                ". Сила: " + force +
                ". Интеллект: " + intellect +
                ". Харизма: " + charisma +
                ". Деньги: " + money;
        return str;
    }

    public float getMoney() {
        return money;
    }
}
package TotalPackage;

import TotalPackage.shop.Good;

import java.util.ArrayList;
import java.util.List;

public class Man {

    public String name = "Петров";
    public int force = 1;
    public int charisma = 1;
    public int intellect = 1;
    public float money = 10f;
    public List<Good> wishGoods = new ArrayList<>();
    public List<Good> purchasedGoods = new ArrayList<>();

    public String toString() {
        String str = "Имя: " + name +
                ". Сила: " + force +
                ". Интеллект: " + intellect +
                ". Харизма: " + charisma +
                ". Деньги: " + money;
        return str;
    }

    public void consumeAll() {
        for (Good good : purchasedGoods) {
            good.consume();
        }
        purchasedGoods.clear();
    }

    public float getMoney() {
        return money;
    }
}
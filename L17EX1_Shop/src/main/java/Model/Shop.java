package Model;

import java.io.Serializable;
import java.util.*;

public class Shop implements Serializable{

    public Map<Integer, Good> mapOfGoods = new HashMap<>(); // <ID, товар>
    public Map<Integer, Integer> mapOfQuantity = new HashMap<>(); // <ID, количество товаров>
    public Map<Integer, Account> mapOfAccounts = new HashMap<>(); // <ID, аккаунт>

}
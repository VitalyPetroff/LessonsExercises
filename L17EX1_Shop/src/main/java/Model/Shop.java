package Model;

import java.util.*;

public class Shop {

    public Map<Integer, Integer> mapOfQuantity = new HashMap<>(); // <ID, количество>
    public Map<Integer, Account> mapOfAccounts = new HashMap<>(); // <ID, аккаунт>
}
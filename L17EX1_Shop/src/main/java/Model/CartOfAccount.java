package Model;

import java.util.HashMap;
import java.util.Map;

public class CartOfAccount {

    public Map<Integer, Integer> mapOfQuantity = new HashMap<>(); // <goodId, quantityOfGood>
    public Map<Integer, Integer> mapOfPrice = new HashMap<>(); // <goodId, priceOfId>
}
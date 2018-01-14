package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CartOfAccount implements Serializable {

    public Map<Integer, Integer> mapOfQuantity = new HashMap<>(); // <goodId, quantityOfGood>
    public Map<Integer, Integer> mapOfPrice = new HashMap<>(); // <goodId, priceOfId>
}
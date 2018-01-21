package Model;

import org.eclipse.jetty.server.Authentication;

import java.io.Serializable;
import java.util.*;

public class Shop implements Serializable{

    public Map<Integer, Good> mapOfGoods = new HashMap<>(); // <ID, товар>
    public Map<Integer, Integer> mapOfQuantity = new HashMap<>(); // <ID, количество товаров>
    public Map<Integer, Account> mapOfAccounts = new HashMap<>(); // <ID, аккаунт>

    ObjectMapper mapper = new ObjectMapper();
    Authentication.User user = new Authentication.User();
            createDummyUser();

}
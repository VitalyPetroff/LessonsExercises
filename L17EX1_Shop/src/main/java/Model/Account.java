package Model;

import java.io.Serializable;

public class Account implements Serializable {

    public String nameOfAccount;
    public CartOfAccount cartOfAccount = new CartOfAccount();

    public Account(String nameOfAccount){
        this.nameOfAccount = nameOfAccount;
    }

    @Override
    public String toString() {
        String str = "Имя аккаунта: " + nameOfAccount;
        return str;
    }
}
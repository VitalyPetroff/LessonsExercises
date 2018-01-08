package Model;

public class Account {

    public String nameOfAccount;
    public CartOfAccount cartOfAccount = new CartOfAccount();

    public Account(String nameOfAccount){
        this.nameOfAccount = nameOfAccount;
    }

    @Override
    public String toString() {
        String str = " имя аккаунта: " + nameOfAccount;
        return str;
    }
}
package Model;

public class Account {

    public String nameOfAccount;
    public CartOfAccount cartOfAccount = new CartOfAccount();

    public Account(String nameOfAccount){
        id = idCounter;
        idCounter++;
        this.nameOfAccount = nameOfAccount;
    }

    @Override
    public String toString() {
        String str = "ID:" + id + " имя аккаунта: " + nameOfAccount;
        return str;
    }
}
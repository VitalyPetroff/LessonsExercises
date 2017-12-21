package TotalPackage.Tenant.Music;

public class Band {

    private String nameOfBand;
    private int statusOfBand;

    public Band(String nameOfBand, int statusOfBand) {
        this.nameOfBand = nameOfBand;
        this.statusOfBand = statusOfBand;
    }

    public String toString(){
        String result = "бэнд " + nameOfBand + " со статусом " + statusOfBand;
        return result;
    }
}

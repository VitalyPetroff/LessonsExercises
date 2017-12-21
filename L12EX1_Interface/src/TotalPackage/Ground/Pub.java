package TotalPackage.Ground;

import TotalPackage.Tenant.Music.Band;
import TotalPackage.Tenant.Music.EventPlayGround;

public class Pub implements EventPlayGround {

    private String nameOfPub;
    private int hour;

    public Pub(String nameOfPub, int hour){
        this.nameOfPub = nameOfPub;
        this.hour = hour;
    }
    @Override
    public void makeSomeNoise(Band band) {
        System.out.println("Сегодня в пабе " + nameOfPub + " в " +
        hour + " часов играет  "+ band.toString());
    }
}

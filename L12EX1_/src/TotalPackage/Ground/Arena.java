package TotalPackage.Ground;

import TotalPackage.Tenant.Music.Band;
import TotalPackage.Tenant.Music.EventPlayGround;
import TotalPackage.Tenant.Sport.SportPlayGround;
import TotalPackage.Tenant.Sport.Team;

public class Arena implements EventPlayGround, SportPlayGround {

    private String nameOfArena;

    public Arena(String nameOfArena) {
        this.nameOfArena = nameOfArena;
    }

    @Override
    public void makeSomeNoise(Band band) {
        System.out.println("Сегодня на арене " + nameOfArena + " играет " + band.toString());

    }

    @Override
    public void teamPlay(Team firstTeam, Team secondTeam) {
        System.out.println("Сегодня на арене " + nameOfArena + " играют " +
                firstTeam.toString() + " и  "+ secondTeam.toString());
    }
}

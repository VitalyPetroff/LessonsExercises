package TotalPackage.Ground;

import TotalPackage.Tenant.Sport.SportPlayGround;
import TotalPackage.Tenant.Sport.Team;

public class Stadium implements SportPlayGround {

    private String nameOfStadium;

    public Stadium(String nameOfStadium) {
        this.nameOfStadium = nameOfStadium;
    }

    @Override
    public void teamPlay(Team firstTeam, Team secondTeam) {

        System.out.println("Сегодня на стадионе " + nameOfStadium + " играют " +
                firstTeam.toString() + " и "+ secondTeam.toString());
    }
}

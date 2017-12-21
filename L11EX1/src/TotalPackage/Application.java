package TotalPackage;

import TotalPackage.Ground.Arena;
import TotalPackage.Ground.Pub;
import TotalPackage.Ground.Stadium;
import TotalPackage.Tenant.Music.Band;
import TotalPackage.Tenant.Sport.Team;

public class Application {

    public static void main(String[] args) {
        Band band = new Band("\"Макс Корж\"", 2);
        Team firstTeam = new Team("\"БАТЭ\"", 1);
        Team secondTeam = new Team("\"Динамо\"", 2);
        Pub underGround = new Pub("\"Подземка\"", 7);
        Stadium borisovArena = new Stadium("\"Борисов-Арена\"");
        Arena minskArena = new Arena("\"Минск Арена\"");


        underGround.makeSomeNoise(band);
        borisovArena.teamPlay(secondTeam, firstTeam);
        minskArena.makeSomeNoise(band);
        minskArena.teamPlay(firstTeam, secondTeam);
    }

}
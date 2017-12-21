package TotalPackage;

import TotalPackage.Ground.Arena;
import TotalPackage.Ground.Pub;
import TotalPackage.Ground.Stadium;
import TotalPackage.Tenant.Music.Band;
import TotalPackage.Tenant.Music.EventPlayGround;
import TotalPackage.Tenant.Sport.SportPlayGround;
import TotalPackage.Tenant.Sport.Team;

public class Application {

    public static void main(String[] args) {
        Band band = new Band("\"Макс Корж\"", 2);
        Team firstTeam = new Team("\"БАТЭ\"", 1);
        Team secondTeam = new Team("\"Динамо\"", 2);
        EventPlayGround underGround = new Pub("\"Подземка\"", 7);
        SportPlayGround borisovArena = new Stadium("\"Борисов-Арена\"");
        SportPlayGround minskArena = new Arena("\"Минск Арена\"");
        EventPlayGround chijovkaArena = new Arena("\"Чижовка-Арена\"");


        underGround.makeSomeNoise(band);
        borisovArena.teamPlay(secondTeam, firstTeam);
        chijovkaArena.makeSomeNoise(band);
        minskArena.teamPlay(firstTeam, secondTeam);
    }

}
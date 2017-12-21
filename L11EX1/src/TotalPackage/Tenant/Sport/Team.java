package TotalPackage.Tenant.Sport;

public class Team {

    private String nameOfTeam;
    private int statusOfTeam;

    public Team(String nameOfTeam, int statusOfTeam) {
        this.nameOfTeam = nameOfTeam;
        this.statusOfTeam = statusOfTeam;
    }

    public String toString(){
        String result = "команда " + nameOfTeam + " со статусом " + statusOfTeam;
        return result;
    }
}

import java.util.HashSet;
import java.util.Set;

public class GamePlay {

    public static void main(String[] args) {

        Set<Person> players = new HashSet<>();

        gameInitialization(players);
        night(players);
        printInfo(players);
        day(players);
        printInfo(players);
    }

    public static void gameInitialization(Set<Person> players) {
        for (int i = 0; i < 5; i++) {
            Person player = new Person("CIVILIAN");
            players.add(player);
        }

        for (int i = 0; i < 2; i++) {
            Person player = new Person("MAFIOSI");
            players.add(player);
        }
        printInfo(players);
    }

    public static Set<Person> night(Set<Person> players) {
        System.out.println("\nНаступила НОЧЬ");
        for (Person player : players) {
            if (player.getProfession().equals("CIVILIAN")) {
                System.out.print("Мафия убила: ");
                player.printPersonsInformation();
                players.remove(player);
                break;
            }
        }
        return players;
    }

    public static Set<Person> day(Set<Person> players) {
        System.out.println("\nНаступил ДЕНЬ");
        for (Person player : players) {
            System.out.print("Решено убить: ");
            player.printPersonsInformation();
            players.remove(player);
            break;
        }
        return players;
    }

    public static boolean checkGameState (Set<Person> players){

    }

    public static void printInfo(Set<Person> players) {
        System.out.println("CОСТАВ ИГРОКОВ:");
        for (Person player : players) {
            player.printPersonsInformation();
        }
    }
}

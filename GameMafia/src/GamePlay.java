import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GamePlay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Person> players = new HashSet<>();

        gameInitialization(players);
        boolean gameStatus;
        while (true) {
            night(players);
            scan.next();
            printInfo(players);
            gameStatus = checkGameState(players);
            if (gameStatus){
                System.out.println("ИГРА ОКОНЧЕНА");
                break;
            }
            day(players);
            scan.next();
            printInfo(players);
            gameStatus = checkGameState(players);
            if (gameStatus){
                System.out.println("ИГРА ОКОНЧЕНА");
                break;
            }
        }
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
        int countOfMafiosi = 0;
        int countOfCivilians = 0;
        for (Person player : players){
            if (player.getProfession().equals("MAFIOSI")){
                countOfMafiosi++;
            } else {
                countOfCivilians++;
            }
        }
        if ((countOfMafiosi > countOfCivilians) ||
                (countOfMafiosi > ((countOfCivilians + countOfMafiosi) / 2))){
            System.out.println("Мафия ПОБЕДИЛА !!!");
            return true;
        }
        if (countOfMafiosi == 0){
            System.out.println("Мафия проиграла !!!");
            return true;
        }
        return false;
    }

    public static void printInfo(Set<Person> players) {
        System.out.println("CОСТАВ ИГРОКОВ:");
        for (Person player : players) {
            player.printPersonsInformation();
        }
    }
}

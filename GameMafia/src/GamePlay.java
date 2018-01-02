import java.util.*;

public class GamePlay {

    private static final int NUMBER_OF_CIVILIANS = 5;
    private static final int NUMBER_OF_MAFIOSI = 2;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Person> players = new HashSet<>();

        boolean gameStatus;
        while (true) {
            night(players);
            scan.next();
//            printInfo(players);
            gameStatus = checkGameState(players);
            if (gameStatus) {
                System.out.println("ИГРА ОКОНЧЕНА");
                break;
            }
            day(players);
            scan.next();
//            printInfo(players);
            gameStatus = checkGameState(players);
            if (gameStatus) {
                System.out.println("ИГРА ОКОНЧЕНА");
                break;
            }
        }
    }

    public static void gameInitialization(Set<Person> players) {
        for (int i = 0; i < NUMBER_OF_CIVILIANS; i++) {
            Person player = new Person("CIVILIAN");
            players.add(player);
        }

        for (int i = 0; i < NUMBER_OF_MAFIOSI; i++) {
            Person player = new Person("MAFIOSI");
            players.add(player);
        }
        printInfo(players);
    }

    public static Set<Person> night(Set<Person> players) {
        System.out.println("\nНаступила НОЧЬ");

        List<Person> arrListPlayers = new ArrayList<>(players);
        while (true) {
            int choice;
            choice = (int) (Math.random() * arrListPlayers.size());
            if (arrListPlayers.get(choice).getProfession().equals("CIVILIAN")) {
                System.out.print("Мафия убила: ");
                arrListPlayers.get(choice).printPersonsInformation();
                arrListPlayers.remove(choice);
                players.clear();
                players.addAll(arrListPlayers);
//                printInfo(players);
                break;
            }
        }
        return players;
    }

    public static Set<Person> day(Set<Person> players) {
        List<Person> arrListPlayers = new ArrayList<>(players);

        System.out.println("\nНаступил ДЕНЬ");
        int choice = (int) (Math.random() * arrListPlayers.size());
        System.out.print("Решено убить: ");
        arrListPlayers.get(choice).printPersonsInformation();
        arrListPlayers.remove(choice);
        players.clear();
        players.addAll(arrListPlayers);
//        printInfo(players);
        return players;
    }

    public static boolean checkGameState(Set<Person> players) {
        int countOfMafiosi = 0;
        int countOfCivilians = 0;
        for (Person player : players) {
            if (player.getProfession().equals("MAFIOSI")) {
                countOfMafiosi++;
            } else {
                countOfCivilians++;
            }
        }
        if ((countOfMafiosi > countOfCivilians) ||
                (countOfMafiosi > (players.size() / 2))) {
            System.out.println("Мафия ПОБЕДИЛА !!!");
            printInfo(players);
            return true;
        }
        if (countOfMafiosi == 0) {
            System.out.println("Мафия проиграла !!!");
            printInfo(players);
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
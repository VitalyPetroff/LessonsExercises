import java.util.HashSet;
import java.util.Set;

public class GamePlay {

    public static void main(String[] args) {

        Set <Person> players = new HashSet<>();

        Person[] civilians = new Person[5];
        for (Person player : civilians){
            player = new Person("CIVILIAN");
            player.printPersonsInformation();
            players.add(player);
        }

        Person[] mafiozi = new Person[2];
        for (Person player : mafiozi){
            player = new Person("MAFIA");
            player.printPersonsInformation();
            players.add(player);
        }
    }

    public static Set<Person> night (Set<Person> players){
        boolean choiceIsRight = false;
        while(!choiceIsRight) {
            int choice = (int)(Math.random() * players.size());
            players.get
        }
    }

    public static Set<Person> day (Set<Person> players){

    }

    public static boolean checkGameState (Set<Person> players){

    }

    public static void printInfo(Set<Person> players){

    }
}

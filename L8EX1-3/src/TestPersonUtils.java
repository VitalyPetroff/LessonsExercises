import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TestPersonUtils {

    public static void main(String[] args) {

        final Set<Person> SUSPECTS = new HashSet<>();

        Person[] people = new Person[6];
        people[0] = new Person("Баба Маня", new Date(34, 0, 2));
        people[1] = new Person("Колян", new Date(105, 10, 5));
        people[2] = new Person("Эдик", new Date(99, 11, 15));
        people[3] = new Person("Семён", new Date(42, 4, 5));
        people[4] = new Person("Никитос", new Date(103, 7, 5));
        people[5] = new Person("ФедОр", new Date(107, 11, 5));

        boolean minor;
        for (Person man : people) {
            try {
                minor = PersonUtils.analyzeOfAge(man);
                if (minor){
                    SUSPECTS.add(man);
                }
            } catch (NoProblemException ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            PersonUtils.printSuspects(SUSPECTS);
        } catch (ThereIsAProblemException ex){
            System.out.println(ex.getMessage());
            System.out.println("Список подозрительных лиц очищен");
        } finally {
            SUSPECTS.clear();
        }

        try {
            PersonUtils.printSuspects(SUSPECTS);
        } catch (ThereIsAProblemException ex){
            System.out.println(ex.getMessage());
            SUSPECTS.clear();
            System.out.println("Список подозрительных лиц очищен");
        } finally {
        }
    }
}
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PersonUtils {
    private static final long YEAR = (long)365 * 24 * 60 * 60 * 1000;
    private static final long AGE_OF_18 = (long)18 * 365 * 24 * 60 * 60 * 1000;

    private static final Set<Person> SUSPECTS = new HashSet<>();

    public void analyzeOfAge(Person man){
        Date present = new Date();
        if ((present.getTime() - man.getBirthDate().getTime()) < AGE_OF_18){
            SUSPECTS.add(man);
            System.out.println(man.getName() + " несовершеннолетний !!!");
        } else {
            System.out.println(man.getName() + " совершеннолетний");
        }
    }
    public void printSuspects(){
        for (Person man : SUSPECTS){
            int age = (int)(Math.floor((new Date().getTime() - man.getBirthDate().getTime()) / YEAR));
            System.out.println(man.getName() + " - " + age + " лет");
        }
    }
}
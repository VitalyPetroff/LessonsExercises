import java.util.Date;
import java.util.Set;

public class PersonUtils{
    private static final long YEAR = (long)365 * 24 * 60 * 60 * 1000;
    private static final long AGE_OF_18 = 18 * YEAR;
    private static final long AGE_OF_70 = 70 * YEAR;

    public static boolean analyzeOfAge(Person man) throws NoProblemException{
        boolean minor = false;
        Date present = new Date();
        int years = (int)((present.getTime() - man.getBirthDate().getTime()) / YEAR);

        System.out.println(man.getName() + ", возраст: " + years + " лет.");
        if ((present.getTime() - man.getBirthDate().getTime()) < AGE_OF_18){
            minor = true;
        }
        if ((present.getTime() - man.getBirthDate().getTime()) > AGE_OF_70){
            throw new NoProblemException("...возраст данной личности свыше 70 лет");
        }
        return minor;
    }

    public static void printSuspects(Set<Person> SUSPECTS)throws ThereIsAProblemException{
        System.out.println("\nСписок несовершеннолетних личностей :");
        for (Person man : SUSPECTS){
            int age = (int)(Math.floor((new Date().getTime() - man.getBirthDate().getTime()) / YEAR));
            System.out.println(man.getName() + " - " + age + " лет");
        }
        if (SUSPECTS.size() > 3){
            throw new ThereIsAProblemException("НЕСАНЦИОНИРОВАННЫЙ МИТИНГ !!!");
        }
    }
}
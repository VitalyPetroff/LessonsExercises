import java.util.Date;
import java.util.Set;

public class TestPersonUtils {

    public static void main(String[] args) {
        PersonUtils security = new PersonUtils();

        Person man1 = new Person("Баба Маня", new Date(70, 0, 2));
        security.analyzeOfAge(man1);

        Person man2 = new Person("Колян", new Date(105, 10, 5));
        security.analyzeOfAge(man2);

        Person man3 = new Person("Эдик", new Date(99, 11, 15));
        security.analyzeOfAge(man3);

        Person man4 = new Person("Семён", new Date(63, 4, 5));
        security.analyzeOfAge(man4);

        Person man5 = new Person("Никитос", new Date(103, 7, 5));
        security.analyzeOfAge(man5);

        Person man6 = new Person("ФедОр", new Date(83, 11, 5));
        security.analyzeOfAge(man6);
    }
}

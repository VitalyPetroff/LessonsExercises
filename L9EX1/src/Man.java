public class Man extends Creature{

    private final String firstName = "Петя";
    private final String lastName = "Лошариков";

    public void consume(Creature creature){
        System.out.println("Класс Man");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

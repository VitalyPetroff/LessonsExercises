public class Man extends Creature {

    private final String firstName;
    private final String lastName;

    public Man(String title, float mass, int percent, String firstName, String lastName) {
        super(title, mass, percent);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void consume(Creature food) throws IllegalArgumentException {
        if (food instanceof Chicken) {
            System.out.println(title + " съел " +
                    food.getTitle() + ". Усвоилось " + (food.mass * percent / 100) + " кг");
        } else {
            throw new IllegalArgumentException();
        }
}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
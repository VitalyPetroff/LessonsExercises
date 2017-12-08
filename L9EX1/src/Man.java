public class Man extends Creature{

    private final String firstName;
    private final String lastName;

    public Man(String title, float mass, int percent, String firstName, String lastName){
        super(title, mass, percent);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void consumer(Creature creature){
        try{
            if (creature instanceof Chicken){
                System.out.println(title + " съел " + creature.getTitle() + ". Усвоилось " + (creature.mass * percent / 100));
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException ex){
            System.out.println(title + " не ест " + creature.getTitle());
        }
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
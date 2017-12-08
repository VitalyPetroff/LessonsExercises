public class Dog extends Animal {

    public Dog(String title, float mass, int percent) {
        super(title, mass, percent);
    }

    public void consume(Creature food) throws IllegalArgumentException{
        if ((food instanceof Cat) ||
                (food instanceof Chicken) ||
                (food instanceof Man)) {
            System.out.println(title + " съел " + food.getTitle() +
                    ". Усвоилось " + (food.mass * percent / 100) + " кг");
        } else {
            throw new IllegalArgumentException();
        }
    }
}
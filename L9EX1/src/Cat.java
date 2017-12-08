public class Cat extends Animal{

    public Cat(String title, float mass, int percent) {
        super(title, mass, percent);
    }

    public void consume(Creature food) throws IllegalArgumentException{
        if ((food instanceof Chicken) ||
                (food instanceof Mouse)){
            System.out.println(title + " съел " + food.getTitle() + ". Усвоилось " + (food.mass * percent / 100));
        } else {
            throw new IllegalArgumentException();
        }
    }
}

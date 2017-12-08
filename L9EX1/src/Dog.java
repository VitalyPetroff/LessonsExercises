public class Dog extends Animal {

    public Dog(String title, float mass, int percent) {
        super(title, mass, percent);
    }

    public void consume(Creature creature){
        try {
            if ((creature instanceof Cat) ||
                    (creature instanceof Chicken) ||
                    (creature instanceof Man)) {
                System.out.println(title + " съел " + creature.getTitle() + ". Усвоилось " + (creature.mass * percent / 100));
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(title + " не ест " + creature.getTitle());
        }
    }
}

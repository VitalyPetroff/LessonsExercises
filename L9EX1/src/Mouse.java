public class Mouse extends Animal{

    public Mouse(String title, float mass, int percent){
        super(title, mass, percent);
    }

    public void consume(Creature creature){
        try{
            if (creature instanceof Bug) {
                System.out.println(title + " съел " + creature.getTitle() + ". Усвоилось " + (creature.mass * percent / 100));
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException ex){
            System.out.println(title + " не ест " + creature.getTitle());
        }
    }
}
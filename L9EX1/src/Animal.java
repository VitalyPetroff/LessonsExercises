public class Animal extends Creature {

    public Animal(String title, float mass, int percent) {
        this.title = title;
        this.mass = mass;
        this.percent = percent;
    }

    public void consume(Creature food){
        System.out.println("Кажется, тут кто-то кого-то пытается съесть...");
    }
}
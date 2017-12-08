public class Creature {

    protected final String title;
    protected float mass;
    protected int percent;

    Creature(String title, float mass, int percent) {
        this.title = title;
        this.mass = mass;
        this.percent = percent;
    }

    public void consume(Creature food){
        System.out.println("Тут кто-то кого-то пытается есть...");
    }

    public float getMass() {
        return mass;
    }

    public int getPercent() {
        return percent;
    }

    public String getTitle(){
        return title;
    }
}
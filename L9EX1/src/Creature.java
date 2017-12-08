public class Creature {

    protected String title = "Сущность";
    protected float mass = 10.0f;
    protected int percent = 50;

    Creature(String title, float mass, int percent) {
        this.title = title;
        this.mass = mass;
        this.percent = percent;
    }

    private void consume(Creature creature){
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
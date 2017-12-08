public abstract class Creature {

    protected String title;
    protected float mass;
    protected int percent;

    public abstract void consume(Creature food);

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
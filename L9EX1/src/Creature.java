public class Creature {

    private final String title;
    private float mass;
    private final int consumePercentage;

    Creature(){
        title = "Название";
        mass = 80.11f;
        consumePercentage = 80;
    }

    public String getTitle(){
        return title;
    }

    private void consume(Creature creature){
        System.out.println("Класс Creature" + creature.consumePercentage);
    }
}
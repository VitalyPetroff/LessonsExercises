public class Mouse extends Animal{

    public Mouse(String title, float mass, int percent){
        super(title, mass, percent);
    }

    public void consume(Creature food) throws IllegalArgumentException{
        if (food instanceof Bug) {
            System.out.println(title + " съел " + food.getTitle() +
                    ". Усвоилось " + (food.mass * percent / 100) + " кг");
        } else {
            throw new IllegalArgumentException();
        }
    }
}
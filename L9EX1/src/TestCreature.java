public class TestCreature {

    public static void main(String[] args) {

        Creature[] arrayOfObjects = new Creature[6];
        arrayOfObjects[0] = new Dog("Собака", 40, 10);
        arrayOfObjects[1] = new Cat("Кот", 8, 20);
        arrayOfObjects[2] = new Bug("Жук", 0.1f, 1);
        arrayOfObjects[3] = new Chicken("Цыплёнок", 1, 25);
        arrayOfObjects[4] = new Mouse("Мышь", 0.5f, 2);
        arrayOfObjects[5] = new Man("Чувак", 80, 2, "Семён", "Николаевич");

        for (Creature typeOfCreature : arrayOfObjects) {
            for (Creature food : arrayOfObjects) {
                try {
                    typeOfCreature.consume(food);
                } catch (IllegalArgumentException e) {
                    System.out.println(typeOfCreature.getTitle() + " не употребляет в пищу " + food.getTitle());
                }
            }
            System.out.println("==========");
        }
    }
}
public class TestCreature {

    public static void main(String[] args) {
        Dog objDog = new Dog("Собака", 40, 10);
        Cat objCat = new Cat("Кот", 8, 20);
        Bug objBug = new Bug("Жук", 0.1f, 1);
        Chicken objChicken = new Chicken("Цыплёнок", 1, 25);
        Mouse objMouse = new Mouse("Мышь", 0.5f, 2);
        Man objMan = new Man("Абырвалг", 80, 2, "Семён", "Николаевич");

        objDog.consume(objBug);
        objDog.consume(objCat);
        objDog.consume(objChicken);
        objDog.consume(objMan);

        objCat.consume(objBug);
        objCat.consume(objCat);
        objCat.consume(objChicken);
        objCat.consume(objDog);

        objMouse.consume(objCat);
        objMouse.consume(objBug);

        objMan.consumer(objBug);
        objMan.consumer(objChicken);
    }
}
public class TestCreature {

    public static void main(String[] args) {
        Dog objDog = new Dog("Собака", 40, 10);
        Cat objCat = new Cat("Кот", 8, 20);
        Bug objBug = new Bug("Жук", 0.1f, 1);

        objDog.consume(objBug);
        objDog.consume(objCat);
    }
}

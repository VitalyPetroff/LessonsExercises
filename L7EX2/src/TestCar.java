public class TestCar {

    public static void main(String[] args) {
        // первый автомобиль
        Car firstCar = new Car("Audi", "A4", 55, 7.4f);
        firstCar.printInfo();

        firstCar.fillTank(60);
        firstCar.move(1000);
        firstCar.move(200);

        // второй автомобиль
        Car secondCar = new Car();
        secondCar.printInfo();

        secondCar.fillTank(80);
        secondCar.move(600);
        secondCar.move(500);
    }
}

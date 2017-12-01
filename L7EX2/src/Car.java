public class Car {

    private final String make; // марка
    private final String model; // модель
    private final float tankCapacity; // объем бака
    private final float fuelConsumption; // расход топлива
    private float fuellnTank;   // текущее количество топлива
    private float milleage; // пробег

    public Car() {
        make = "Volvo";
        model = "S80";
        tankCapacity = 65f;
        fuelConsumption = 8.2f;
    }

    public Car(String make, String model, float tankCapacity, float fuelConsumption) {
        this.make = make;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        fuellnTank = 0;
        milleage = 0;
    }

    public void printInfo() {
        System.out.println("Марка машины: " + make);
        System.out.println("Модель машины: " + model);
        System.out.println("Объем бака: " + tankCapacity);
        System.out.println("Расход топлива: " + fuelConsumption);
        System.out.println("Текущее количество топлива: " + fuellnTank);
        System.out.println("Пробег: " + milleage + "\n");
    }

    public void fillTank(float amount) {
        try {
            fuellnTank += amount;
            if (fuellnTank > tankCapacity) {
                float delta = fuellnTank - tankCapacity;
                fuellnTank = tankCapacity;
                throw new IllegalArgumentException("!!! В бак не поместилось " + delta + " л");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            printInfo();
        }
    }

    public void move(int distance) {
        float realDistance = distance;
        try {
            float fuelForDistance = distance / 100 * fuelConsumption;
            fuellnTank -= fuelForDistance;
            if (fuellnTank < 0) {
                float remainOfFuel = fuellnTank + fuelForDistance;
                realDistance = remainOfFuel / fuelConsumption * 100;
                fuellnTank = 0;
                throw new IllegalStateException("!!! Бак пуст. Затрачено " + remainOfFuel +
                        " л. Пройденное расстояние составляет " + realDistance + " км" );
            }
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }finally {
            milleage += realDistance;
            printInfo();
        }
    }
}
public class Car {

    private final String make; // марка
    private final String model; // модель
    private final float tankCapacity; // объем бака
    private final float fuelConsumption; // расход топлива
    private float fuellnTank;   // текущее количество топлива
    private float milleage; // пробег

    public Car() {
    }

    public Car(String make, String model, float tankCapacity, float fuelConsumption) {
        this.make = make;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
        fuellnTank = 0;
        milleage = 0;
    }

    public void printInfo(){
        System.out.println("Марка машины: " + make);
        System.out.println("Модель машины: " + model);
        System.out.println("Объем бака: " + tankCapacity);
        System.out.println("Расход топлива: " + fuelConsumption);
        System.out.println("Текущее количество топлива: " + fuellnTank);
        System.out.println("Пробег: " + milleage);
    }
}

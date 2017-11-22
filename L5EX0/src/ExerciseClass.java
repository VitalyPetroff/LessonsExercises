import java.util.Scanner;

public class ExerciseClass {

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        forthTask();
        fifthTask();
    }

    public static void firstTask(){
        Scanner scan = new Scanner(System.in);
        byte input;
        byte doz;
        byte un;

        System.out.println("\nЗАДАНИЕ №1");
        System.out.print("Введите двузначное число: ");
        input = scan.nextByte();
        doz = (byte)(input / 10);
        un = (byte)(input % 10);
        if (doz == un) {
            System.out.println("Значения разрядов равны");
        } else if (doz > un){
            System.out.println("Большая цифра - " + doz + ". Меньшая цифра - " + un);
        } else {
            System.out.println("Большая цифра - " + un + ". Меньшая цифра - " + doz);
        }
    }

    public static void secondTask(){
        Scanner scan = new Scanner(System.in);
        short input;
        byte th;
        byte hund;
        byte doz;
        byte un;

        System.out.println("\nЗАДАНИЕ №2");
        System.out.print("Введите четырёхзначное число: ");
        input = scan.nextShort();
        th = (byte)(input / 1000);
        hund = (byte)((input - th * 1000) / 100);
        doz = (byte)((input - th * 1000 - hund * 100) / 10);
        un = (byte)(input % 10);

        System.out.println("Первый разряд равен " + th);
        System.out.println("Второй разряд равен " + hund);
        System.out.println("Третий разряд равен " + doz);
        System.out.println("Четвёртый разряд равен " + un);
    }

    public static void thirdTask(){
        double kg;
        int gr;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nЗАДАНИЕ №3");
        System.out.print("Введите вес в граммах: ");
        gr = scan.nextInt();
        kg = (double)gr / 1000;
        System.out.println("Вес в килограммах равен: " + kg);
    }

    public static void forthTask(){
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("ЗАДАНИЕ №4");
        System.out.print("Введите первое число: ");
        a = scan.nextInt();
        System.out.print("Введите второе число: ");
        b = scan.nextInt();

        if (a == b){
            System.out.println("\nЧисла равны");
        } else if (a > b){
            System.out.println("\nЧисло " + a + " больше числа " + b);
        } else {
            System.out.println("\nЧисло " + b + " больше числа " + a);
        }
    }

    public static void fifthTask(){
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.println("ЗАДАНИЕ №5");
        System.out.print("Введите число a = ");
        a = scan.nextInt();
        System.out.print("Введите число b = ");
        b = scan.nextInt();
        System.out.print("Введите число c = ");
        c = scan.nextInt();

        System.out.println("\nРезультат равен: " + ((a + b - c / a) + c * a * a - (a + b)));
    }
}

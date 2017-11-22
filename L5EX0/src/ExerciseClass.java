import java.util.Scanner;

public class ExerciseClass {

    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        thirdTask();
//        forthTask();
        fifthTask();
    }

    public static void firstTask(){
        Scanner scan = new Scanner(System.in);
        byte input;
        byte des;
        byte ed;

        System.out.println("\nЗАДАНИЕ №1");
        System.out.print("Введите двузначное число: ");
        input = scan.nextByte();
        des = (byte)(input / 10);
        ed = (byte)(input % 10);
        if (des == ed) {
            System.out.println("Значения разрядов равны");
        } else if (des > ed){
            System.out.println("Большая цифра - " + des + ". Меньшая цифра - " + ed);
        } else {
            System.out.println("Большая цифра - " + ed + ". Меньшая цифра - " + des);
        }
    }

    public static void secondTask(){
        Scanner scan = new Scanner(System.in);
        short input;
        byte th;
        byte hund;
        byte des;
        byte ed;

        System.out.println("\nЗАДАНИЕ №2");
        System.out.print("Введите четырёхзначное число: ");
        input = scan.nextShort();
        th = (byte)(input / 1000);
        hund = (byte)((input - th * 1000) / 100);
        des = (byte)((input - th * 1000 - hund * 100) / 10);
        ed = (byte)(input % 10);

        System.out.println("Первый разряд равен " + th);
        System.out.println("Второй разряд равен " + hund);
        System.out.println("Третий разряд равен " + des);
        System.out.println("Четвёртый разряд равен " + ed);
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

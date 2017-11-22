import java.util.Scanner;

public class TaskClass {

    public static void main(String[] args) {
//        firstTask();
        secondTask();
//        thirdTask();
//        forthTask();
//        fifthTask();
//        sixthTask();
    }

    public static void firstTask(){
        Scanner scan = new Scanner(System.in);
        double n, k, res;

        System.out.println("\nЗадание №1");
        System.out.print("Введите n = ");
        n = scan.nextInt();
        System.out.print("Введите k = ");
        k = scan.nextInt();
        res = 0;
        for (int i = 1; i <= n; i++){
            res += Math.pow(i, k);
        }
        System.out.println("Результат суммы равен " + res);
    }

    public static void secondTask(){
        Scanner scan = new Scanner(System.in);
        int day;
        String result;

        System.out.println("ЗАДАНИЕ №2");
        System.out.print("Введите номер дня недели :");
        day = scan.nextInt();
        switch (day) {
            case 1:
                result = "ПН";
                break;
            case 2:
                result = "ВТ";
                break;
            case 3:
                result = "CР";
                break;
            case 4:
                result = "ЧТ";
                break;
            case 5:
                result = "ПТ";
                break;
            case 6:
                result = "СБ";
                break;
            case 7:
                result = "ВСКР";
                break;
            default:
                result = "Введён неверный номер дня!";
                break;
        }
        System.out.println(result);
    }
}

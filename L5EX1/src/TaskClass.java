import java.util.Scanner;

public class TaskClass {

    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        thirdTask();
//        forthTask();
        fifthTask();
//        sixthTask();
    }

    public static void firstTask(){
        Scanner scan = new Scanner(System.in);
        double n;
        double k;
        double res;

        System.out.println("ЗАДАНИЕ №1");
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

        System.out.println("\nЗАДАНИЕ №2");
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

    public static void thirdTask(){
        Scanner scan = new Scanner(System.in);
        int N;
        int[] mass;
        int max;
        byte input;
        boolean choise = false;

        System.out.println("\nЗАДАНИЕ №3");
        System.out.print("Введите размерность массива: ");
        N = scan.nextInt();
        mass = new int[N];
        while (!choise){
            System.out.print("Какой тип ввода данных (0 - ручной; 1 - автоматический): ");
            input = scan.nextByte();
            switch (input){
                case 0:
                    for (int i = 0; i < N; i++){
                        System.out.print("mass[" + i + "] = ");
                        mass[i] = scan.nextInt();
                        System.out.println("\n");
                    }
                    choise = true;
                    break;
                case 1:
                    for (int i = 0; i < N; i++){
                        mass[i] = (int)(Math.random()*100);
                        System.out.print("mass[" + i + "] = " + mass[i] + ";\n");
                    }
                    choise = true;
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
        }
        max = mass[0];
        for (int i = 1; i < N; i++){
            if (mass[i] > max){
                max = mass[i];
            }
        }
        System.out.println("Максимальный элемент в массиве равен " + max);

    }

    public static void forthTask(){
        int N;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nЗАДАНИЕ №4");
        System.out.print("Введите значение N ");
        N = scan.nextInt();
        if (N > 0) {
            do {
                System.out.println("N = " + N);
                N--;
            } while (N > 0);
        }
    }

    public static void fifthTask(){
        Scanner scan = new Scanner(System.in);
        int N = 2000;     // число строк
        int M = 2000;      // число столбцов
        int[][] mass = new int[N][M];
        int sum = 0;
        double average;

        System.out.println("\nЗАДАНИЕ №5");
        System.out.println("Сформированный массив:");
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++) {
                mass[i][j] = (int) (Math.random() * 100 + 1);
//                System.out.print(mass[i][j] + "\t");
            }
//            System.out.print("\n");
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                sum += mass[i][j];
            }
        }
        average = (double)sum / (N * M);
        System.out.println("Среднее арифметическое элементов массива равно: " + average);
    }

    public static void sixthTask(){
        Scanner scan = new Scanner(System.in);
        int N;
        int[][] mass;

        System.out.println("ЗАДАНИЕ №6");
        System.out.print("Введите размерность массива N = ");
        N = scan.nextInt();
        mass = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (i <= j){
                    mass[i][j] = 1;
                }
                System.out.print(mass[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

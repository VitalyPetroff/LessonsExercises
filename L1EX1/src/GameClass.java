import java.util.ArrayList;
import java.util.Scanner;

public class GameClass {
    private Scanner scan = new Scanner(System.in);
    private int userNumber;
    private ArrayList<Integer> placeOfBullet = new ArrayList<Integer>();
    private int counter = 0;
    private String win = "ПОБЕДА !!! :)";
    private String loss = "ПОРАЖЕНИЕ ... :(";
    private String result = win;

    // выбор местоположения игрока
    private void userChoice() {
        int num;

        while (true) {
            System.out.println("Введите число в интервале 1..6:");
            num = scan.nextInt();
            if ((num > 0) && (num < 7)) {
                this.userNumber = num;
                break;
            } else {
                System.out.println("Введённое число не в интервале 1..6. Попробуйте ещё раз!");
            }
        }
    }

    // генерация местоположения пуль
    private void generation(int length){
        int randomNum;

        placeOfBullet.clear();
        while (placeOfBullet.size() < length) {
            randomNum = (int) (Math.random() * 7 + 1);
            if (!placeOfBullet.contains(randomNum)) {
                placeOfBullet.add(randomNum);
            }
        }
    }

    // игровой процесс
    public void play(int type) {
        while (!result.equals(loss)) {
            this.userChoice();          // выбор игрока
            this.generation(type);      // местоположение пуль
            for (int cell : placeOfBullet) {
                if (this.userNumber == cell) {
                    result = loss;
                    break;
                }
            }
            this.counter++;
            System.out.println(result);
            System.out.print("Пули были в № ");
            for (int cell : placeOfBullet){
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("Количество попыток = " + this.counter);
    }
}
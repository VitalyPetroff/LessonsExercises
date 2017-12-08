import java.util.Date;

public class CurrentSecondsTest {

    public static void main(String[] args) throws InterruptedException {
        final int constSecond1 = 49;
        final int constSecond2 = 53;
        compareSeconds(constSecond1);
        compareSecondsRecursive(constSecond2);
    }

    public static void compareSeconds(int constSec) throws InterruptedException {
        int currentSecond;
        do {
            currentSecond = new Date().getSeconds();
            if (currentSecond != constSec) {
                System.out.println("Текущая секунда : " + currentSecond);
                Thread.sleep(1000);
            } else {
                System.out.println("Текущая секунда равна заданной! " + currentSecond);
                break;
            }
        } while (true);
    }

    public static void compareSecondsRecursive(int constSec) throws InterruptedException {
        int currentSecond = new Date().getSeconds();
        if (currentSecond != constSec) {
            System.out.println("Текущая секунда : " + currentSecond);
            Thread.sleep(1000);
            compareSecondsRecursive(constSec);
        } else {
            System.out.println("Текущая секунда равна заданной! " + currentSecond);
        }
    }
}
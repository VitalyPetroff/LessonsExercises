import java.util.Date;

public class CurrentSecondsTest {

    public static void main(String[] args) {
        final int currentSecond1 = 49;
        final int currentSecond2 = 57;
        compareSeconds(currentSecond1);
        compareSecondsRecursive(currentSecond2);
    }

    public static void compareSeconds(int sec){
        do {
            if (sec == (new Date().getSeconds())) {
                System.out.println("Текущая секунда равна константе " + sec);
                break;
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } while (true);
    }

    public static void compareSecondsRecursive(int sec){
        if (sec == new Date().getSeconds()){
            System.out.println("Текущая секунда равна константе " + sec);
        } else {
            try{
                Thread.sleep(1000);
                compareSeconds(sec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

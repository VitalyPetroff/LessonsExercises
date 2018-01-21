public class MyThreadImplements implements Runnable {
    MyThreadImplements(){

    }

    public void run(){
        System.out.println("Start");
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            System.out.println("Pause");
        }
        System.out.println("Finish");
    }
}

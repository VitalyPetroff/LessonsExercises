public class MyThread extends Thread {

    String name;

    MyThread(String name){
        super(name);
        this.name = name;
    }

    public void run(){
        System.out.println("Выполняется поток " + name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        System.out.println("Закончил работу поток" + name);
    }
}

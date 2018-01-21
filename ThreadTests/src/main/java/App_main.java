public class App_main {

    public static void main(String[] args) {
        System.out.println("Главный поток");

        MyThread newThread = new MyThread("Второй поток");
        newThread.start();

        System.out.println("Завершение работы главного потока");

        MyThreadImplements newThread2 = new MyThreadImplements();
        newThread2.start();
    }
}

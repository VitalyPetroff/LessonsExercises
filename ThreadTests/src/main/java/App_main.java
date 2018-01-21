public class App_main {

    public static void main(String[] args) {
        System.out.println("Главный поток");

        MyThread t1 = new MyThread("Второй поток");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Прерван поток " + t1.name);
        }

        System.out.println("Завершение работы главного потока");

//        MyThreadImplements newThread2 = new MyThreadImplements();
//        newThread2.start();
    }
}

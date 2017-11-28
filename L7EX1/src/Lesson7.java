public class Lesson7 {

    public static void main(String[] args) {
        print();
    }

    public static void print(){
        System.out.println("Message");
    }

    static void print(String msg){
        System.out.println("New Message");
        System.out.println("New msg + 1");
    }
}
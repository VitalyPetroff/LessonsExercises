public class Lesson7 {

    public static void main(String[] args) {
        print();
        Lesson7 les = new Lesson7();
        les.dynamicPrint();
    }

    public static void print(){
        System.out.println("Message");
    }

    void dynamicPrint(){
        System.out.println("Message dynamic");
    }
}
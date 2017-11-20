public class Exercise1 {

    public static void main(String[] args) {
        int a, b;
        a = (int)(Math.random()*10);
        b = (int)(Math.random()*10);
        arithmetic(a, b);
    }

    public static void arithmetic(int a, int b){
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
    }
}
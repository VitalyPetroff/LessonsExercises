public class Exercise1 {

    public static void main(String[] args) {
        int a, b;
        boolean t = true;
        boolean f = false;

        a = (int)(Math.random()*10);
        b = (int)(Math.random()*10);
        System.out.println("a = " + a + "; b = " + b);
        arithmetic(a, b);
        binary(a, b);
        System.out.println("t = " + t + " f = " + f);
        logical(t, f);

        condition(t);
        ternary(t, a, b);
        condition(f);
        ternary(f, a, b);

    }

    private static void arithmetic(int a, int b){
        System.out.println("\nАРИФМЕТИЧЕСКИЕ ОПЕРАЦИИ: ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a * b = " + ((double)a / b));
    }

    private static void binary(int a, int b){
        System.out.println("\nБИНАРНЫЕ ОПЕРАЦИИ: ");
        System.out.println("a | b = " + (a | b));
        System.out.println("a & b = " + (a & b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    }

    private static void logical(boolean first, boolean second){
        System.out.println("\nЛОГИЧЕСКИЕ ОПЕРАЦИИ :");
        System.out.println("a || b = " + (first || second));
        System.out.println("a && b = " + (first && second));
        System.out.println("!a = " + !first);
        System.out.println("!b = " + !second);
    }

    private static void condition(boolean condition){
        System.out.println("\n Проверка условия :");
        if (condition){
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE !");
        }
    }

    private static void ternary(boolean condition, int first, int second){
        int result;
        System.out.println("\n Работа тернарного оператора :");
        result = (condition ? first : second);
        System.out.println("Result = " + result);
    }
}
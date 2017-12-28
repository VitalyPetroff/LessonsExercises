package example;

import java.text.MessageFormat;
import java.util.Arrays;

public class Logic {

    public int customMath(int a, int b){
        if(a < b) {
            return a + b;
        }
        if (a > b) {
            return a - b;
        }
        throw new IllegalArgumentException("Wrong condition");
    }

    public String kill(String order, int count, String... executors) {
        if (executors.length == 0) {
            throw new NullPointerException("Must be at least one executor");
        }
        return MessageFormat.format(
                "Order {0} with {1} victims was successfully executed by {2}",
                order,
                count,
                Arrays.toString(executors)
        );
    }

    public int multiply(int first, int second, int... rest){
        if (first == 0 || second == 0){
            throw new UnsupportedOperationException("Not allowed");
        }
        if (rest.length == 0) {
            return first * second;
        } else {
            return (first + second) * Arrays.stream(rest).sum();
        }
    }
}
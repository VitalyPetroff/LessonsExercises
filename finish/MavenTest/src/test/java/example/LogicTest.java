package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void customMath() {
        final Logic logic = new Logic();
        assertEquals(3, logic.customMath(1, 2));
        assertEquals(1, logic.customMath(2, 1));
        assertThrows(IllegalArgumentException.class, new Executable(){
            public void execute() throws Throwable {
                logic.customMath(2, 2);
            }
        });

        assertEquals("Order FIRST with 3 victims was successfully executed by [STR, OKA]",
                logic.kill("FIRST", 3, "STR", "OKA"));
        assertThrows(NullPointerException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                logic.kill("Строка", 1);
            }
        });

        assertEquals(15, logic.multiply(5, 3));
        assertEquals(10, logic.multiply(2, 3, new int[]{1, 1}));
        assertThrows(UnsupportedOperationException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                logic.multiply(0, 0);
            }
        });
    }
}
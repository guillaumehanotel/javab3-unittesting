package operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {

    private static final Operations operations = new Operations();

    @Test
    public void add() {
        assertEquals("2 + 5 should equals 7", (Integer)7, operations.add(5,2));
    }

    @Test
    public void multiply() {
        assertEquals("2 * 5 should equals 10", (Integer)10, operations.multiply(5,2));
    }


}
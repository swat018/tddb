package chap02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void plus() {
        int result = Caculalator.plus(1, 2);
        assertEquals(3, result);
        assertEquals(5, Caculalator.plus(4, 1));
    }
}

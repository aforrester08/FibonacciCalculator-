import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void before() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void canGetNthNumber() {
        assertEquals(21, fibonacci.valueOfNthNumber(8));
    }
}

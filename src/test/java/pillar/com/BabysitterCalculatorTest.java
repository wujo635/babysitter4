package pillar.com;

import org.junit.Test;
import static org.junit.Assert.*;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void shouldReturnZeroWithNoInputParameters() {
        assertEquals(0, calculator.calculate(0,0));
    }
}

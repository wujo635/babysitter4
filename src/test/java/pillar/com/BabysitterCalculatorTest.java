package pillar.com;

import org.junit.Test;

import static org.junit.Assert.*;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void shouldReturnZeroIfStartEqualEndTime() {
        assertEquals(0, calculator.calculate(17, 17));
    }

    @Test
    public void shouldDisallowStartTimeEarlierThan5pm() {
        assertEquals(-1, calculator.calculate(16, 0));
    }
}

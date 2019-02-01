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

    @Test
    public void shouldAllowStartTimeAsLateAs4am() {
        assertEquals(0, calculator.calculate(4, 4));
    }

    @Test
    public void shouldDisallowStartTimeAfter4am() {
        assertEquals(-1, calculator.calculate(5, 5));
    }

    @Test
    public void shouldDisallowEndTimeEarlierThan5pm() {
        assertEquals(-1, calculator.calculate(17,16));
    }

    @Test
    public void shouldDisallowEndTimeAfter4am() {
        assertEquals(-1,calculator.calculate(3,5));
    }

    @Test
    public void shouldCalculateOneHourOfWork() {
        assertEquals(1, calculator.calculate(17,18));
    }
}

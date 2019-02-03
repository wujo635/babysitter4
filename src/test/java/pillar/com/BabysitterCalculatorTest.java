package pillar.com;

import org.junit.Test;

import static org.junit.Assert.*;

public class BabysitterCalculatorTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();
    private Family family = new Family();

    @Test
    public void shouldReturnZeroIfStartEqualEndTime() {
        assertEquals(0, calculator.calculate(17, 17, family));
    }

    @Test
    public void shouldDisallowStartTimeEarlierThan5pm() {
        assertEquals(-1, calculator.calculate(16, 0, family));
    }

    @Test
    public void shouldAllowStartTimeAsLateAs4am() {
        assertEquals(0, calculator.calculate(4, 4, family));
    }

    @Test
    public void shouldDisallowStartTimeAfter4am() {
        assertEquals(-1, calculator.calculate(5, 5, family));
    }

    @Test
    public void shouldDisallowEndTimeEarlierThan5pm() {
        assertEquals(-1, calculator.calculate(17, 16, family));
    }

    @Test
    public void shouldDisallowEndTimeAfter4am() {
        assertEquals(-1, calculator.calculate(3, 5, family));
    }

    @Test
    public void shouldCalculateOneHourOfWork() {
        assertEquals(1, calculator.calculate(17, 18, family));
    }

    @Test
    public void shouldCalculateMultipleHoursOfWork() {
        assertEquals(2, calculator.calculate(17, 19, family));
    }

    @Test
    public void shouldDisallowEndBeforeStartTime() {
        assertEquals(-1, calculator.calculate(20, 17, family));
    }

    @Test
    public void shouldDisallowEndBeforeStartWithMidnightCrossing() {
        assertEquals(-1, calculator.calculate(4, 17, family));
    }

    @Test
    public void shouldCalculatePayWithMidnightCrossing() {
        assertEquals(2, calculator.calculate(23, 1, family));
    }
}

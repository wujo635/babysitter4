package pillar.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyBabysitterTest {

    private BabysitterCalculator calculator = new BabysitterCalculator();

    @Test
    public void shouldCalculatePayWithFamilyA() {
        assertEquals(55, calculator.calculate(22, 1, new FamilyA()));
    }
}

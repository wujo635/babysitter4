package pillar.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyBTest {

    private Family family = new FamilyB();

    @Test
    public void shouldPay12EachHourBefore10pm() {
        assertEquals(12, family.getPayAtHour(17));
        assertEquals(12, family.getPayAtHour(18));
        assertEquals(12, family.getPayAtHour(19));
        assertEquals(12, family.getPayAtHour(20));
        assertEquals(12, family.getPayAtHour(21));
    }

    @Test
    public void shouldPay8EachHourBetween10pmAnd12am() {
        assertEquals(8, family.getPayAtHour(22));
    }
}

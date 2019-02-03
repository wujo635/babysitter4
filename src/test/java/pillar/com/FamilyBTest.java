package pillar.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyBTest {

    private Family family = new FamilyB();

    @Test
    public void shouldPay12EachHourBefore10pm() {
        assertEquals(12, family.getPayAtHour(17));
    }
}

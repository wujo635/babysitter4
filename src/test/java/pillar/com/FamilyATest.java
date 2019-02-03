package pillar.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyATest {

    private Family family = new FamilyA();

    @Test
    public void shouldReturn15PerHourBefore11pm() {
        assertEquals(15, family.getPayAtHour(17));
        assertEquals(15, family.getPayAtHour(18));
        assertEquals(15, family.getPayAtHour(19));
        assertEquals(15, family.getPayAtHour(20));
        assertEquals(15, family.getPayAtHour(21));
        assertEquals(15, family.getPayAtHour(22));
    }

    @Test
    public void shouldReturn20PerHourAfter11pm() {
        assertEquals(20, family.getPayAtHour(0));
    }

}

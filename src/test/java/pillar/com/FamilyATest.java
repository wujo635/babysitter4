package pillar.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyATest {

    private Family family = new FamilyA();

    @Test
    public void shouldReturn15PerHourBefore11pm() {
        assertEquals(15, family.getPayAtHour(17));
    }

}

package pillar.com;

public class FamilyA extends Family {

    @Override
    public int getPayAtHour(int hour) {
        if (hour < 23 && hour >= 17) {
            return 15;
        }
        return 20;
    }
}

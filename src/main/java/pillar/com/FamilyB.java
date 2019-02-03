package pillar.com;

public class FamilyB extends Family {

    @Override
    public int getPayAtHour(int hour) {
        if (hour > 21) return 8;
        return 12;
    }
}

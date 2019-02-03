package pillar.com;

public class BabysitterCalculator {


    public int calculate(int start, int end) {
        if (isWithinWorkingHours(start) || isWithinWorkingHours(end)) {
            return -1;
        }
        if (end < start) {
            return -1;
        }
        return (end - start);
    }

    private boolean isWithinWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}

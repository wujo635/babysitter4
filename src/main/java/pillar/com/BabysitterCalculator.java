package pillar.com;

public class BabysitterCalculator {


    public int calculate(int start, int end) {
        if (isWithinWorkingHours(start) || isWithinWorkingHours(end) || isEndBeforeStart(start, end)) {
            return -1;
        }
        return (end - start);
    }

    private boolean isEndBeforeStart(int start, int end) {
        return end < start;
    }

    private boolean isWithinWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}

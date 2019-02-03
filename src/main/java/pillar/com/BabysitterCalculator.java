package pillar.com;

public class BabysitterCalculator {


    public int calculate(int start, int end) {
        if (isValidWorkingHours(start, end)) {
            return -1;
        }
        return (end - start);
    }

    private boolean isValidWorkingHours(int start, int end) {
        return isOutsideWorkingHours(start) || isOutsideWorkingHours(end) || isEndBeforeStart(start, end);
    }

    private boolean isEndBeforeStart(int start, int end) {
        if (start <= 4 && end >= 17) {
            return true;
        }
        return end < start;
    }

    private boolean isOutsideWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}

package pillar.com;

public class BabysitterCalculator {


    public int calculate(int start, int end) {
        if (isValidWorkingHours(start, end)) {
            return -1;
        }
        if (isValidMidnightCrossing(start, end)) {
            return 24 - start + end;
        }
        return (end - start);
    }

    private boolean isValidWorkingHours(int start, int end) {
        return isOutsideWorkingHours(start) || isOutsideWorkingHours(end) || isEndBeforeStart(start, end);
    }

    private boolean isEndBeforeStart(int start, int end) {
        if (isInvalidMidnightCrossing(start, end)) {
            return true;
        } else if (isValidMidnightCrossing(start, end)) {
            return false;
        }
        return end < start;
    }

    public boolean isInvalidMidnightCrossing(int start, int end) {
        return start <= 4 && end >= 17;
    }

    private boolean isValidMidnightCrossing(int start, int end) {
        return start >= 17 && end <= 4;
    }

    private boolean isOutsideWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}

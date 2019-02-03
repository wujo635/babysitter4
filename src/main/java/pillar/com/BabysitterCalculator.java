package pillar.com;

public class BabysitterCalculator {


    public int calculate(int start, int end, Family family) {
        if (isValidWorkingHours(start, end)) {
            return -1;
        }
        if (isValidMidnightCrossing(start, end)) {
            return sumPay(start, 24, family) + sumPay(0, end, family);
        }
        return sumPay(start, end, family);
    }

    private int sumPay(int start, int end, Family family) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += family.getPayAtHour(i);
        }
        return sum;
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

    private boolean isInvalidMidnightCrossing(int start, int end) {
        return start <= 4 && end >= 17;
    }

    private boolean isValidMidnightCrossing(int start, int end) {
        return start >= 17 && end <= 4;
    }

    private boolean isOutsideWorkingHours(int time) {
        return time < 17 && time > 4;
    }
}

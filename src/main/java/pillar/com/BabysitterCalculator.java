package pillar.com;

public class BabysitterCalculator {


    public int calculate(int start, int end) {
        if (isWithinWorkingHours(start)) {
            return -1;
        }
        return 0;
    }

    private boolean isWithinWorkingHours(int start) {
        return start < 17 && start > 4;
    }
}

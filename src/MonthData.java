public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println("День " + (i + 1) +": " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sum = 0;
        for (int day : days) {
            sum += day;
        }
        return sum;
    }

    int maxSteps() {
        int max = 0;
        for (int i : days) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    int bestSeries(int goalByStepsPerDay) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i : days) {
            if (i >= goalByStepsPerDay) {
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
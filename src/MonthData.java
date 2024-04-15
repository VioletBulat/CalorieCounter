// В данном классе хранятся данные конкретного месяца
// и логика по подсчёту статистики

public class MonthData {
    // Целочисленный массив представляющий количество дней в месяце
    int[] days = new int[30];

    // Вывод статистики за месяц
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println("День " + (i + 1) +": " + days[i]);
        }
    }

    // Подсчёт суммы шагов за месяц
    int sumStepsFromMonth() {
        int sum = 0;
        for (int steps : days) {
            sum += steps;
        }
        return sum;
    }

    // Максимальное количество шагов за месяц
    int maxSteps() {
        int max = 0;
        for (int steps : days) {
            if (steps > max) {
                max = steps;
            }
        }
        return max;
    }

    // Возвращает максимальное количество подряд идущих элементов days[],
    // больших или равных goalByStepsPerDay
    int bestSeries(int goalByStepsPerDay) {
        int maxCount = 0;
        int currentCount = 0;

        for (int steps : days) {
            if (steps >= goalByStepsPerDay) {
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
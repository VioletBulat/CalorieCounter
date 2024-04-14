import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    Converter converter = new Converter();
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for(int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        if(month < 1 || month > 12) {
            System.out.println("Указан неверный номер месяца.");
            return;
        }

        System.out.println("Введите число дня: ");
        int day = scanner.nextInt();
        if(day < 1 || day > 30) {
            System.out.println("Указано неверное число дня.");
            return;
        }

        System.out.println("Введите количество шагов:");
        int steps = scanner.nextInt();
        if(steps < 1) {
            System.out.println("Количество шагов должно быть положительным.");
            return;
        }

        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.println("Веедите цель по количеству шагов на день: ");
        int stepGoal = scanner.nextInt();
        if (stepGoal > 0) {
            goalByStepsPerDay = stepGoal;
        } else {
            System.out.println("Число должно быть положительным.");
        }
    }

    void printStatistic() {
        System.out.println("Введите номер месяца, за который нужно вывести статистику: ");
        int monthStatistic = scanner.nextInt();

        System.out.println("Количество пройденных шагов по дням: ");
        monthToData[monthStatistic - 1].printDaysAndStepsFromMonth();

        int steps = monthToData[monthStatistic - 1].sumStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + steps);

        System.out.println("Максимальное пройденное количество шагов в месяце: " +
                monthToData[monthStatistic - 1].maxSteps());

        int avg = steps / 30;
        System.out.println("Среднее количество шагов: " + avg);

        System.out.println("Пройденная дистанция (в км): " +
                converter.convertToKm(steps));

        System.out.println("Количество сожжённых килокалорий: " +
                converter.convertStepsToKilocalories(steps));

        System.out.println("Лучшая серия: " +
                monthToData[monthStatistic - 1].bestSeries(goalByStepsPerDay));
    }
}
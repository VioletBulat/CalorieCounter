import java.util.Scanner;

// В данном классе производится вся работа
// с пользовательским вводом и выводом меню

public class Main {
    public static void main(String[] args) {
        // Экземпляр класса для считывания данных из консоли
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Выводит количество шагов за определённый день
                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    // Меняет цель по количеству шагов в день
                    stepTracker.changeStepGoal();
                    break;
                case 3:
                    // Печатает статистику за определённый месяц
                    stepTracker.printStatistic();
                    break;
                case 4:
                    // Выход из приложения
                    System.out.println("До свидания!");
                    return;
                default:
                    // Обработка неверно введенных данных
                    System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }
    }

    // Выводит меню в консоль
    static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1.Ввести количество шагов за определённый день");
        System.out.println("2.Изменить цель по количеству шагов в день");
        System.out.println("3.Напечатать статистику за определённый месяц");
        System.out.println("4.Выйти из приложения");
    }
}
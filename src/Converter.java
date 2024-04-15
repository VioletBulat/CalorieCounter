public class Converter {
    // конвертирует шаги в километры
    int convertToKm(int steps) {
        // условное количество сантиметров в шаге
        int stepInCentimeter = 75;
        int centimetersInKilometer = 100000;
        return steps * stepInCentimeter / centimetersInKilometer;
    }

    // конвертирует шаги в килокалории
    int convertStepsToKilocalories(int steps) {
        int caloriesInKilocalorie = 1000;
        // условное количество калорий в одном шаге
        int stepInCalories = 50;
        return steps * stepInCalories / caloriesInKilocalorie;
    }
}
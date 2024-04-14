public class Converter {
    int convertToKm(int steps) {
        int stepInCentimeter = 75;
        return steps * stepInCentimeter;
    }

    int convertStepsToKilocalories(int steps) {
        int stepInCalories = 50;
        return steps * stepInCalories / 1000;
    }
}
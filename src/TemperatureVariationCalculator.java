public class TemperatureVariationCalculator {

    public static int calculateTemperature(int initialTemperature, int[] variations) {
        for (int variation : variations) {
            int change = Math.abs(variation) / 5;

            if (variation > 0) {
                initialTemperature += change;
                System.out.println("Increased by: " + change);
            } else {
                initialTemperature -= Math.abs(variation) / 5;
                System.out.println("Decreased by: " + change);
            }
        }

        return Math.max(initialTemperature, 0);
    }
}
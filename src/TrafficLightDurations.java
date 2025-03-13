public class TrafficLightDurations {

    /**
     * Calculates the new duration of the green light based on the number of vehicles waiting.
     *
     * @param initialDuration The initial green light duration in seconds.
     * @param vehicleCounts   An array representing the number of vehicles waiting at the light.
     * @return The updated duration for the green light in seconds.
     */
    /*public static int calculateTrafficLightDuration(int initialDuration, int[] vehicleCounts) {

        if (vehicleCounts.length == 0) return initialDuration;

        for (int vehicleCount : vehicleCounts) {

            if (vehicleCount > 50) {
                initialDuration = Math.min(initialDuration + 15, 60);
                // System.out.println("Increased by: " + 15);
                System.out.printf("Change: %+d | New Duration: %d\n", 15, initialDuration);
            } else if (vehicleCount < 10) {
                initialDuration = Math.max(initialDuration - 10, 10);
                // System.out.println("Decreased by: " + 10);
                System.out.printf("Change: %+d | New Duration: %d\n", 10, initialDuration);
            } else {
                initialDuration = 30;
                // System.out.println("InitialDuration set to default: " + 30);
                System.out.printf("Change:  % d | New Duration: %d\n", 0, initialDuration);
            }
        }

        return initialDuration;
    }*/
    public static int calculateTrafficLightDuration(int initialDuration, int[] vehicleCounts) {
        if (vehicleCounts.length == 0) return initialDuration;

        for (int vehicleCount : vehicleCounts) {
            initialDuration = 30;

            if (vehicleCount > 50) {
                initialDuration = Math.min(initialDuration + 15, 60);
                // System.out.printf("Change: %+d | New Duration: %d\n", 15, initialDuration);
                System.out.printf("Change: %+3d | New Duration: %3d\n", 15, initialDuration); // Ensuring the space for a sign (+ or -)
            } else if (vehicleCount < 10) {
                initialDuration = Math.max(initialDuration - 10, 10);
                // System.out.printf("Change: %d | New Duration: %d\n", 10, initialDuration);
                System.out.printf("Change: %+3d | New Duration: %3d\n", -10, initialDuration); // Include the minus sign for subtraction
            } else {
                // System.out.printf("Change:  %d | New Duration: %d\n", 0, initialDuration);
                System.out.printf("Change: %+3d | New Duration: %3d\n", 0, initialDuration); // For zero, ensure it's shown with a + sign
            }
        }

        return initialDuration;
    }
}

// TODO: Implement the logic to calculate the duration based on vehicle counts and enforce the min-max duration constraints.

/*
 * The green light operates with the following logic:
 * 1. If the number of vehicles waiting is more than 50, extend the green light duration by 15 seconds
 *    (to reduce congestion).
 * 2. If the number of vehicles waiting is less than 10, reduce the green light duration by 10 seconds
 *    (to save energy).
 * 3. If the number of vehicles waiting is between 10 and 50 (inclusive), maintain the default duration of 30 seconds.
 *
 * Additionally, there are boundaries for the duration of the green light:
 * - The green light cannot be shorter than 10 seconds.
 * - The green light cannot be longer than 60 seconds.
 *
 * The method will return the adjusted duration based on the above conditions while enforcing the min-max boundaries.
 */
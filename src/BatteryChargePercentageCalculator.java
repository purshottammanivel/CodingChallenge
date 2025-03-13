public class BatteryChargePercentageCalculator {

    public static int calculateBatteryPercentage(int initialBattery, int[] events) {

        if (events.length == 0) return initialBattery;

        for (int event : events) {
            int charge = Math.abs(event) / 2;

            if (event > 0) {
                /*initialBattery += charge;
                if (initialBattery > 100) {
                    initialBattery = 100;
                }*/
                initialBattery = Math.min(initialBattery + charge, 100);
                System.out.println("Increased by: " + charge);
            } else {
                /*initialBattery -= charge;
                if (initialBattery < 0) {
                    initialBattery = 0;
                }*/
                initialBattery = Math.max(initialBattery - charge, 0);
                System.out.println("Decreased by: " + charge);
            }
            System.out.println("battery: " + initialBattery);
        }

        return initialBattery;
    }
}
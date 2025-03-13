public class SpeedCalculator {

    public static int calculateSpeed(int speed, int[] degrees) {
        for (int degree : degrees) {
            if (degree > 0) {
                speed = speed + degree / 10;
                System.out.println("degree + => " + degree / 10);
            } else {
                speed = speed - Math.abs(degree) / 10;
                System.out.println("degree - => " + Math.abs(degree) / 10);
            }
        }

        return Math.max(speed, 0);
    }

    public void test(int speed, int[] degrees) {
        for (int i = 0; i < degrees.length; i++) {
            if (degrees[i] > 0) {
                speed = speed + degrees[i] / 10;
                System.out.println("degrees + => " + degrees[i] / 10);
            } else {
                speed = speed - Math.abs(degrees[i]) / 10;
                System.out.println("degrees - => " + Math.abs(degrees[i]) / 10);
            }
        }
    }
}
public class TaxiDispatchSystem {

    public static void main(String[] args) {
        int M = 3; // Number of taxis
        int[] taxis = {3, 8, 15}; // Initial positions of taxis
        int[] requests = {10, 2, 7, 14}; // Ride requests from these locations

        assignClosestTaxi(M, taxis, requests);
    }

    public static void assignClosestTaxi(
            int M,
            int[] taxis,
            int[] requests
    ) {
        for (int request : requests) {
            int bestTaxi = -1;
            int minTime = Integer.MAX_VALUE;

            // Finding the best closest taxi
            for (int i = 0; i < M; i++) {
                int timeToReach = Math.abs(taxis[i] - request);

                if (timeToReach < minTime ||
                        (timeToReach == minTime && bestTaxi == -1)
                        || (timeToReach == minTime && i < bestTaxi)
                ) {
                    bestTaxi = i;
                    minTime = timeToReach;
                }
            }

            // Moving the taxi
            taxis[bestTaxi] = request;

            // Print the assigned taxis and time taken
            System.out.printf("Request at location %d -> Taxi %d (%d minutes)\n", request, bestTaxi + 1, minTime);
        }
    }
}
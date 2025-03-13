public class SmartElevatorSystem {

    public static void main(String[] args) {
        int N = 10;
        int M = 3;
        int[] elevators = {2, 6, 4};
        int[] requests = {8, 1, 5, 6};

        assignElevator(N, M, elevators, requests);
    }

    public static void assignElevator(
            int N,
            int M,
            int[] elevators,
            int[] requests
    ) {
        for (int request : requests) {
            int bestElevator = -1;
            int minTime = Integer.MAX_VALUE;

            // Find the best elevator
            for (int i = 0; i < M; i++) {
                int timeToReach = Math.abs(elevators[i] - request);

                // Choose the elevator with minimum time, and in case of tie, choose the lower index
                if (timeToReach < minTime ||
                        (timeToReach == minTime && bestElevator == -1) ||
                        (timeToReach == minTime && i < bestElevator)
                ) {
                    bestElevator = i;
                    minTime = timeToReach;
                }
                /*if (timeToReach < minTime || (timeToReach == minTime && i < bestElevator)) {
                    bestElevator = i;
                    minTime = timeToReach;
                }*/
            }

            // Move the chosen elevator to the requested floor
            elevators[bestElevator] = request;

            // Print the assigned elevator and time taken
            System.out.printf("Request at floor %d -> Elevator %d (%d seconds)\n", request, bestElevator + 1, minTime);
        }
    }
}
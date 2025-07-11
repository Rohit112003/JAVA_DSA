package NormalQuestion;

public class Customers {
    public static void main(String[] args) {
        int customers[][] = {{5,2},{5,4},{10,3},{20,1}};
        System.out.println(averageWaitingTime(customers));
    }
    public static double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        int totalWaitingTime = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];
            int cookingTime = customers[i][1];
            if (currentTime < arrivalTime) {
                currentTime = arrivalTime;
            }

            currentTime += cookingTime;

            int waitingTime = currentTime - arrivalTime;
            totalWaitingTime += waitingTime;
        }

        return (double) totalWaitingTime / customers.length;
    }
}

package DynamicProgramming;

public class NewKnapsack {
    public static void main(String[] args) {
        {
            int profit[] = new int[] { 60, 100, 120 };
            int weight[] = new int[] { 10, 20, 30 };
            int W = 50;
            int n = profit.length;
            System.out.println(knapSacks(W, weight, profit, n-1));
        }
    }

    public static int knapSacks(int W, int[] weight, int[] profit, int n){
        if(W==0 || n==0){
            return 0;
        }
        if(weight[n]>W){
            return knapSacks(W,weight, profit, n-1);
        }
        return Math.max(profit[n] +knapSacks(W - weight[n] , weight, profit, n-1), knapSacks(W,weight,profit,n-1));

    }
}

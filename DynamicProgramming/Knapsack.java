package DynamicProgramming;

public class Knapsack {
    public static void main(String[] args) {
        {
            int profit[] = new int[] { 60, 100, 120 };
            int weight[] = new int[] { 10, 20, 30 };
            int W = 50;
            int n = profit.length;
            System.out.println(knapSack(W, weight, profit, n));
        }
    }

    private static int knapSack(int W, int[] weight, int[] profit, int n) {
        if(W==0 || n==0){
            return 0;
        }


        if(W< weight[n-1]) {
            return knapSack(W, weight, profit, n - 1);
        }
        else
            return max(profit[n-1]+ knapSack(W-weight[n-1], weight, profit, n-1),knapSack(W, weight, profit, n-1) );

    }

    private static int max(int a, int b) {
        { return (a > b) ? a : b; }
    }
}

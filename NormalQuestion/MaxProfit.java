package NormalQuestion;

public class MaxProfit {
    public static void main(String[] args) {
        int [] difficulty = {2,4,6,8,10};
        int profit[] = {10,20,30,40,50};
        int worker [] = {4,5,6,7};
        System.out.println(maxProfitAssignment(difficulty,profit,worker));

    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        int val= 0;
        for(int i =0; i<worker.length; i++){
            val = findLargestSmallerThanTarget(difficulty, worker[i]);
            maxProfit+=profit[val]; 
        }
        return maxProfit;
    }
    private static int findLargestSmallerThanTarget(int[] difficulty, int target) {
        int start =0;
        int end = difficulty.length-1;
        int candidate = 0;
        while(start<end){
            int mid = (start+end)/2;
            if(difficulty[mid]==target){
                return mid;
            }
            if(difficulty[mid]<target){
                candidate = mid;
                start = mid+1;
            }else{
                end = end-1;
            }
        }
        return candidate;

    }
}

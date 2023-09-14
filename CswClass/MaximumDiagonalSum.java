package CswClass;

public class MaximumDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(mat));

    }
    public static int diagonalSum(int[][] arr){
        int ans = 0;
        int n = arr.length;
        int j = n;
        for(int i = 0;i<n;i++){
                ans = ans + arr[i][i];
        }
        for(int i = 0;i<n;i++){
            ans = ans + arr[i][j-1];
            j--;
        }
        if(n%2!=0)
            return ans-arr[n/2][n/2];

        return ans;
    }
}

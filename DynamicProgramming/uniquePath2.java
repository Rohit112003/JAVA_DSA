package DynamicProgramming;

public class uniquePath2 {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] obstacleGrid = {
                {0,0,0},{0,1,0},{0,0,0},
        };
        int[][] dp = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j =0; j<n;j++){
                dp[i][j]= -1;
            }
        }
        System.out.println(unique(m-1,n-1,dp,obstacleGrid));
    }

        public static int unique(int i,int j , int[][] dp,int[][] obstacleGrid){
            if(i == 0 && j == 0){
                if(obstacleGrid[i][j] != 1){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            if( i < 0 || j < 0){
                return 0;
            }
            if(dp[i][j] != -1){
                return dp[i][j];
            }
            if(obstacleGrid[i][j] == 1){
                return 0;
            }
            int up = unique(i - 1, j,dp,obstacleGrid);
            int left = unique(i, j - 1,dp,obstacleGrid);
            return dp[i][j] = up + left;
        }


    }


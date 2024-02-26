package DynamicProgramming;

public class Uniquepath {
    public static void main(String[] args) {
        int m =3;
        int n =3;
        System.out.println(tabulation(m,n));
    }
    public static int tabulation(int m , int n ){
        int[][] Dp = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n ; j++){
                if(i==0 && j==0 ){
                    Dp[i][j] = 1;
                }else{
                    int up =0;
                    int left =0;
                    if(i>0) up= Dp[i-1][j];
                    if(j>0) left = Dp[i][j-1];
                    Dp[i][j] = up+left;
                }
            }

        }
        return Dp[m-1][n-1];
    }
}

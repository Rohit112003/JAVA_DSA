package Graph;
import java.util.*;
public class numberOfOranges {
    class Pair{
        int row;
        int col;
        int tm;
        Pair(int row, int col, int tm){
            this.row = row;
            this.col= col;
            this.tm = tm;
        }
    }
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<Pair> q = new LinkedList<>();
        int countfresh = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        for(int i = 0; i<grid.length;i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]= 0;
                }
                if(grid[i][j]==1){
                    countfresh++;
                }

            }
        }

        int time = 0;
        int[] drow = {-1,0,+1,0};
        int[] dcol = {0,+1,0,-1};
        int cnt = 0;
        while(!q.isEmpty()){
            int r= q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            time = Math.max(time, t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                if(nrow>=0&& nrow<n  && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=countfresh) return -1;
        return time;




    }
}

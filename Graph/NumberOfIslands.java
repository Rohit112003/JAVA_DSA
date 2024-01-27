package Graph;
import java.util.*;
class Pair{
     int num;
     int newNum;
     Pair(int num, int newNum){
         this.num = num;
         this.newNum = newNum;
     }
 }

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1'},
                {'1','1','1','1'},
                {'1','1','1','1'},
                {'1','1','1','1'}
        };
        int ans = numIslands(grid);
        System.out.println(ans);

    }
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] vis = new int[n][m];
        for(int row = 0 ; row<n; row++){
            for(int col = 0 ; col<m;col++){
                if(vis[row][col]==0 && grid[row][col]=='1'){
                    count++;
                    bfs(row,col, vis,grid);
                }
            }
        }
        return count;
    }
    public static void bfs(int row, int col, int vis[][], char grid[][]){
         vis[row][col] = 1;
         Queue<Pair> q = new LinkedList<>();
         q.add(new Pair(row,col));
         int n = grid.length;
         int m = grid[0].length;
         while(!q.isEmpty()){
             int newRow = q.peek().num;
             int newCol = q.peek().newNum;
             q.remove();
             for(int delRow=-1; delRow<=1;delRow++){
                 for(int delCol=-1; delCol<=1;delCol++){
                     int nrow = newRow + delRow;
                     int ncol = newCol + delCol;
                     if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                         q.add(new Pair(nrow,ncol));
                         vis[nrow][ncol]=1;
                     }

                 }

             }


         }

     }
}

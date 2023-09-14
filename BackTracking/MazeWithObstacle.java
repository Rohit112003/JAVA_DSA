package BackTracking;

public class MazeWithObstacle {
    public static void main(String[] args) {
        Boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", board, 0,0);
    }

    private static void pathRestrictions(String s, Boolean[][] maze, int r, int c) {
        if(r==maze.length-1 &&  c==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestrictions(s+"D", maze, r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(s+"R", maze,r,c+1);
        }
    }
}

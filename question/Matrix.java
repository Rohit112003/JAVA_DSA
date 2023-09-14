import java.util.LinkedList;
import java.util.Queue;

public class Matrix {
    int n ;
    public int adjascenyMatrix[][];

    Matrix(int n){
        this.n = n;
        this.adjascenyMatrix = new int [n][n];


    }
    public void addEdge(int source, int destination){
        adjascenyMatrix[source][destination] =1;
        adjascenyMatrix[destination][source] =1;
    }
    public void BFS(int startVertex){
        boolean[] vis =new boolean[5];
        Queue<Integer> q = new LinkedList<>();
        vis[startVertex] = true;
        q.offer(startVertex);
        while(!q.isEmpty()){
            int currentVertex = q.poll();
            for(int i = 0; i<n;i++){
                if (adjascenyMatrix[currentVertex][i] == 1 && !vis[i]) {
                    vis[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}

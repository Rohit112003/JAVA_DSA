package CswClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int N;
    private ArrayList<ArrayList<Integer>> adjacencyList;
    public Graph(int N) {
        this.N = N;
        this.adjacencyList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int Source, int Destination){
        adjacencyList.get(Source).add(Destination);
        adjacencyList.get(Destination).add(Source);
    }

    public void addBFS(int startVertex){
        boolean[] visited = new boolean[N];

        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.offer(startVertex);
        while(!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbour : adjacencyList.get(currentVertex)) {

                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }

            }
        }

    }
    public void DFS(int startVertex, boolean[] visited) {
        visited[startVertex] = true;
        System.out.print(startVertex + " ");

        ArrayList<Integer> neighbors = adjacencyList.get(startVertex);
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }

    public void dfsTraversal(int startVertex) {
        boolean[] visited = new boolean[N];
        DFS(startVertex, visited);
    }
}

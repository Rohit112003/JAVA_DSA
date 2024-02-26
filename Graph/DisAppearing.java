package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DisAppearing {
    public static void main(String[] args) {
        int N = 6; // Number of vertices
        int M = 7; // Number of edges
        int[] A = {0, 0, 1, 1, 2, 3, 4};
        int[] B = {1, 2, 3, 4, 5, 4, 5};

        int time = dissApear(N, M, A, B);
        System.out.println("All vertices will disappear after " + time + " seconds.");
    }

    public static int dissApear(int N, int M, int[] A, int[] B) {
        ArrayList<Integer>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            graph[A[i]].add(B[i]);
            graph[B[i]].add(A[i]);
        }

        boolean[] d = new boolean[N];
        int time = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // Start from vertex 0

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int vertex = queue.poll();
                d[vertex] = true;
                for (int neighbor : graph[vertex]) {
                    if (!d[neighbor]) {
                        queue.add(neighbor);
                    }
                }
            }
            time++;
        }

        return time;
    }
}


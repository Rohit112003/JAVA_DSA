package ust.MutiThreading.ExecutorFramework;

import java.util.LinkedList;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class ParallelUniverseExplorer {

    private static final ForkJoinPool pool = new ForkJoinPool();
    LinkedList<Integer> list   =new LinkedList<>();

    public static void main(String[] args) {
        ExploreTask rootTask = new ExploreTask(0, 5);
        pool.invoke(rootTask);
    }

    static class ExploreTask extends RecursiveAction {
        private int start;
        private int end;
        private static final int THRESHOLD = 2;

        public ExploreTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if ((end - start) <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    System.out.println("Exploring sector: " + i + " by " + Thread.currentThread().getName());
                }
            } else {
                int mid = (start + end) / 2;
                ExploreTask left = new ExploreTask(start, mid);
                ExploreTask right = new ExploreTask(mid, end);
                invokeAll(left, right);
            }
        }
    }
}

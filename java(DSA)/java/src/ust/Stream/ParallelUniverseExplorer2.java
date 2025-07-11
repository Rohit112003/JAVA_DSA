package ust.Stream;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ParallelUniverseExplorer2 {

    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> sequentialTimeline = IntStream.rangeClosed(1, 5)
            .mapToObj(i -> "Sequential Event " + i)
            .collect(Collectors.toList());

    private static final List<String> parallelTimelines = IntStream.rangeClosed(1, 5)
            .mapToObj(i -> "Parallel Event " + i)
            .collect(Collectors.toList());

    public static void main(String[] args) {
        List<String> exploredParallelTimelines = parallelTimelines.parallelStream()
                .map(event -> exploreEvent(event))
                .collect(Collectors.toList());

        exploredParallelTimelines.forEach(System.out::println);
    }

    private static String exploreEvent(String event) {
        return "Explored -> " + event;
    }
}

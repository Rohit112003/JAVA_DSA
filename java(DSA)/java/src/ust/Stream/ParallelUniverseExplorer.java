package ust.Stream;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ParallelUniverseExplorer {

    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> sequentialTimeline = IntStream.rangeClosed(1, 10)
            .mapToObj(i -> "Timeline Event " + i)
            .collect(Collectors.toList());

    public static void main(String[] args) {
        List<String> exploredTimeline = sequentialTimeline.stream()
                .map(event -> exploreEvent(event))
                .collect(Collectors.toList());

        exploredTimeline.forEach(System.out::println);
    }

    private static String exploreEvent(String event) {
        return "Explored -> " + event;
    }
}


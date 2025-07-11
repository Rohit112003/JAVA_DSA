package ust.Stream;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

class ParallelUniverseExplorer3 {

    private static final List<String> sequentialTimeline = List.of(
            "Sequential Event 1", "Sequential Event 2", "Sequential Event 3"
    );

    private static final List<String> parallelTimelines = List.of(
            "Parallel Event A", "Parallel Event B", "Parallel Event C"
    );

    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        TimelineSubscriber subscriber = new TimelineSubscriber();

        publisher.subscribe(subscriber);

        sequentialTimeline.forEach(event -> publisher.submit("Sequential -> " + event));
        parallelTimelines.parallelStream().forEach(event -> publisher.submit("Parallel -> " + event));

        publisher.close();
    }

    static class TimelineSubscriber implements Flow.Subscriber<String> {
        private Flow.Subscription subscription;

        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            subscription.request(Long.MAX_VALUE);
        }

        public void onNext(String item) {
            System.out.println("Received: " + item);
        }

        public void onError(Throwable throwable) {
            System.out.println("Error: " + throwable.getMessage());
        }

        public void onComplete() {
            System.out.println("Exploration Complete");
        }
    }
}

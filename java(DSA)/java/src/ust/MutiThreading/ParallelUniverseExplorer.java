package ust.MutiThreading;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow;

public class ParallelUniverseExplorer {

    private static final ForkJoinPool pool = new ForkJoinPool();

    private static final List<String> sequentialTimeline = List.of(
            "Seq-1", "Seq-2", "Seq-3"
    );

    private static final List<String> parallelTimelines = List.of(
            "Par-1", "Par-2", "Par-3"
    );

    private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
    private static final Object sharedResource = new Object();

    public static void main(String[] args) {

        publisher.subscribe(new TimelineSubscriber());

        Thread sequentialThread = new Thread(() -> {
            for (String event : sequentialTimeline) {
                synchronized (sharedResource) {
                    publisher.submit("Sequential -> " + event);
                    sharedResource.notify();
                    try {
                        sharedResource.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        Thread parallelThread = new Thread(() -> {
            parallelTimelines.parallelStream().forEach(event -> {
                synchronized (sharedResource) {
                    publisher.submit("Parallel -> " + event);
                    sharedResource.notify();
                    try {
                        sharedResource.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        });

        sequentialThread.start();
        parallelThread.start();

        try {
            sequentialThread.join();
            parallelThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

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
            Thread.onSpinWait();
        }

        public void onError(Throwable throwable) {
            System.out.println("Error: " + throwable.getMessage());
        }

        public void onComplete() {
            System.out.println("Exploration Completed");
        }
    }
}

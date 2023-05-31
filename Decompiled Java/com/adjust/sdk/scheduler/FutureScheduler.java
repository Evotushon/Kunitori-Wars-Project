package com.adjust.sdk.scheduler;

import java.util.concurrent.ScheduledFuture;

public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j, long j2);

    void teardown();
}

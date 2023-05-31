package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingleThreadFutureScheduler implements FutureScheduler {
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public SingleThreadFutureScheduler(final String str, boolean z) {
        this.scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryWrapper(str), new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
        if (!z) {
            this.scheduledThreadPoolExecutor.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
            this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    public ScheduledFuture<?> scheduleFuture(Runnable runnable, long j) {
        return this.scheduledThreadPoolExecutor.schedule(new RunnableWrapper(runnable), j, TimeUnit.MILLISECONDS);
    }

    public ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j, long j2) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new RunnableWrapper(runnable), j, j2, TimeUnit.MILLISECONDS);
    }

    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}

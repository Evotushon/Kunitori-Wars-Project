package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(getApplicationContext());
        TransportContext.Builder priority = TransportContext.builder().setBackendName(string).setPriority(PriorityMapping.valueOf(i));
        if (string2 != null) {
            priority.setExtras(Base64.decode(string2, 0));
        }
        TransportRuntime.getInstance().getUploader().upload(priority.build(), i2, new Runnable(jobParameters) {
            private final /* synthetic */ JobParameters f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                JobInfoSchedulerService.this.lambda$onStartJob$0$JobInfoSchedulerService(this.f$1);
            }
        });
        return true;
    }

    public /* synthetic */ void lambda$onStartJob$0$JobInfoSchedulerService(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}

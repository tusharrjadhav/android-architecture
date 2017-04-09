package com.example.android.architecture.blueprints.todoapp.util.schedulers;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tushar_temp on 09/04/17.
 */

@Module
public class ScheduleProviderModule {

    @Provides
    public SchedulerProvider schedulerProvider() {
        return new SchedulerProvider();
    }
}

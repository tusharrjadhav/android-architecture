package com.example.android.architecture.blueprints.todoapp.util.schedulers;

import dagger.Component;

/**
 * Created by Tushar_temp on 09/04/17.
 */
@Component(modules = ScheduleProviderModule.class)
public interface ScheduleProviderCompoment {
    SchedulerProvider schduleProvider();
}

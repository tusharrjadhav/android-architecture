package com.example.android.architecture.blueprints.todoapp;

import android.app.Application;

import com.example.android.architecture.blueprints.todoapp.data.source.DaggerTasksRepositoryComponent;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryModule;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.DaggerScheduleProviderCompoment;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.ScheduleProviderCompoment;

/**
 * Created by Tushar_temp on 29/03/17.
 */

public class ToDoApplication extends Application {

    TasksRepositoryComponent tasksRepositoryComponent;

    ScheduleProviderCompoment scheduleProviderCompoment;

    @Override
    public void onCreate() {
        super.onCreate();

        scheduleProviderCompoment = DaggerScheduleProviderCompoment.builder()
                .build();

        tasksRepositoryComponent = DaggerTasksRepositoryComponent.builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
                .tasksRepositoryModule(new TasksRepositoryModule(scheduleProviderCompoment.schduleProvider()))
                .build();
    }

    public TasksRepositoryComponent getTasksRepositoryComponent() {
        return tasksRepositoryComponent;
    }

    public ScheduleProviderCompoment getScheduleProviderCompoment() {
        return scheduleProviderCompoment;
    }
}

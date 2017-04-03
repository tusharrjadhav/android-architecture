package com.example.android.architecture.blueprints.todoapp;

import android.app.Application;

import com.example.android.architecture.blueprints.todoapp.data.source.DaggerTasksRepositoryComponent;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;

/**
 * Created by Tushar_temp on 29/03/17.
 */

public class ToDoApplication extends Application {

    TasksRepositoryComponent tasksRepositoryComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        tasksRepositoryComponent = DaggerTasksRepositoryComponent.builder()
                .applicationModule(new ApplicationModule(getApplicationContext()))
                .build();
    }

    public TasksRepositoryComponent getTasksRepositoryComponent() {
        return tasksRepositoryComponent;
    }
}

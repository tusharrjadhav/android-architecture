package com.example.android.architecture.blueprints.todoapp.data.source;

import android.content.Context;

import com.example.android.architecture.blueprints.todoapp.ApplicationScope;
import com.example.android.architecture.blueprints.todoapp.data.FakeTasksRemoteDataSource;
import com.example.android.architecture.blueprints.todoapp.data.source.local.TasksLocalDataSource;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tushar_temp on 29/03/17.
 */

@Module
public class TasksRepositoryModule {

    SchedulerProvider schedulerProvider;

    public TasksRepositoryModule(SchedulerProvider schedulerProvider) {
        this.schedulerProvider = schedulerProvider;
    }

    @ApplicationScope
    @Provides
    @Local
    TasksDataSource provideTasksLocalDataSource(Context context) {
        return new TasksLocalDataSource(context, schedulerProvider);
    }

    @ApplicationScope
    @Provides
    @Remote
    TasksDataSource provideTasksRemoteDataSource() {
        return new FakeTasksRemoteDataSource();
    }

}

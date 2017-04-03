package com.example.android.architecture.blueprints.todoapp.tasks;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tushar_temp on 31/03/17.
 */
@Module
public class TasksPresenterModule {

    private final TasksContract.View view;

    public TasksPresenterModule(TasksContract.View view) {
        this.view = view;
    }

    @Provides
    TasksContract.View provideView() {
        return view;
    }
}

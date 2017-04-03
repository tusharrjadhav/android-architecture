package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.support.annotation.Nullable;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tushar_temp on 03/04/17.
 */

@Module
public class TaskDetailPresenterModule {

    TaskDetailContract.View mTaskDetailView;

    @Nullable
    String mTaskId;

    public TaskDetailPresenterModule(TaskDetailContract.View mTaskDetailView, @Nullable String mTaskId) {
        this.mTaskDetailView = mTaskDetailView;
        this.mTaskId = mTaskId;
    }

    @Provides
    public TaskDetailContract.View provideView() {
        return mTaskDetailView;
    }

    @Provides
    @Nullable
    public String provideTaskId() {
        return mTaskId;
    }
}

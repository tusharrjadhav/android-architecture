package com.example.android.architecture.blueprints.todoapp.taskdetail;

import com.example.android.architecture.blueprints.todoapp.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;

import dagger.Component;

/**
 * Created by Tushar_temp on 03/04/17.
 */
@ActivityScope
@Component(dependencies = TasksRepositoryComponent.class, modules = TaskDetailPresenterModule.class)
public interface TaskDetailComponent {
    void inject(TaskDetailActivity taskDetailActivity);
}

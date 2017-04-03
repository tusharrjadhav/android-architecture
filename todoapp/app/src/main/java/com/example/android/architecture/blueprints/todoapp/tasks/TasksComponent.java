package com.example.android.architecture.blueprints.todoapp.tasks;

import com.example.android.architecture.blueprints.todoapp.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;

import dagger.Component;

/**
 * Created by Tushar_temp on 31/03/17.
 */
@ActivityScope
@Component(dependencies = TasksRepositoryComponent.class, modules = TasksPresenterModule.class)
public interface TasksComponent {
    void inject(TasksActivity tasksActivity);
}

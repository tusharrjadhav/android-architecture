package com.example.android.architecture.blueprints.todoapp.data.source;

import com.example.android.architecture.blueprints.todoapp.ApplicationModule;
import com.example.android.architecture.blueprints.todoapp.ApplicationScope;

import dagger.Component;

/**
 * Created by Tushar_temp on 29/03/17.
 */
@ApplicationScope
@Component(modules = {TasksRepositoryModule.class, ApplicationModule.class})
public interface TasksRepositoryComponent {

    TasksRepository getTasksRepository();
}

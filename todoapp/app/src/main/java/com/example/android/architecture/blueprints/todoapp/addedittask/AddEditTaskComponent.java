package com.example.android.architecture.blueprints.todoapp.addedittask;

import com.example.android.architecture.blueprints.todoapp.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.ScheduleProviderCompoment;

import dagger.Component;

/**
 * Created by Tushar_temp on 29/03/17.
 */

@ActivityScope
@Component(dependencies = {TasksRepositoryComponent.class, ScheduleProviderCompoment.class}, modules = AddEditTaskPresenterModule.class)
public interface AddEditTaskComponent {
    void inject(AddEditTaskActivity addEditTaskActivity);
}

package com.example.android.architecture.blueprints.todoapp.tasks;

import com.example.android.architecture.blueprints.todoapp.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.CompositeSubscriptionMdule;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.ScheduleProviderCompoment;

import dagger.Component;

/**
 * Created by Tushar_temp on 31/03/17.
 */
@ActivityScope
@Component(dependencies = {TasksRepositoryComponent.class, ScheduleProviderCompoment.class}, modules = {TasksPresenterModule.class, CompositeSubscriptionMdule.class})
public interface TasksComponent {
    void inject(TasksActivity tasksActivity);
}

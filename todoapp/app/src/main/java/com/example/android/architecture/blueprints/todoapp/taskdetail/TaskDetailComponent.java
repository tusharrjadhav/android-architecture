package com.example.android.architecture.blueprints.todoapp.taskdetail;

import com.example.android.architecture.blueprints.todoapp.ActivityScope;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryComponent;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.CompositeSubscriptionMdule;
import com.example.android.architecture.blueprints.todoapp.util.schedulers.ScheduleProviderCompoment;

import dagger.Component;

/**
 * Created by Tushar_temp on 03/04/17.
 */
@ActivityScope
@Component(dependencies = {TasksRepositoryComponent.class, ScheduleProviderCompoment.class}, modules = {TaskDetailPresenterModule.class, CompositeSubscriptionMdule.class})
public interface TaskDetailComponent {
    void inject(TaskDetailActivity taskDetailActivity);
}

package com.example.android.architecture.blueprints.todoapp.util.schedulers;

import com.example.android.architecture.blueprints.todoapp.ActivityScope;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Tushar_temp on 09/04/17.
 */

@Module
public class CompositeSubscriptionMdule {

    @ActivityScope
    @Provides
    public CompositeSubscription compositeSubscription() {
        return new CompositeSubscription();
    }
}

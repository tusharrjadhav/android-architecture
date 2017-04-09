package com.example.android.architecture.blueprints.todoapp.statistics;

import com.example.android.architecture.blueprints.todoapp.util.schedulers.CompositeSubscriptionMdule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tushar_temp on 03/04/17.
 */
@Module(includes = CompositeSubscriptionMdule.class)
public class StatisticsPresenterModule {
    StatisticsContract.View mStatisticsView;

    public StatisticsPresenterModule(StatisticsContract.View mStatisticsView) {
        this.mStatisticsView = mStatisticsView;
    }

    @Provides
    public StatisticsContract.View provideView() {
        return mStatisticsView;
    }
}

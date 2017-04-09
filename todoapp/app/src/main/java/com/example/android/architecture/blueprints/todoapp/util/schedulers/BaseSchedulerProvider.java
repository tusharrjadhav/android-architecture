package com.example.android.architecture.blueprints.todoapp.util.schedulers;

/**
 * Created by Tushar_temp on 07/04/17.
 */

import android.support.annotation.NonNull;

import rx.Scheduler;


/**
 * Allow providing different types of {@link Scheduler}s.
 */
public interface BaseSchedulerProvider {

    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}

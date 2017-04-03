package com.example.android.architecture.blueprints.todoapp;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tushar_temp on 29/03/17.
 */
@Module
public class ApplicationModule {
    private Context mContext;

    public ApplicationModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}


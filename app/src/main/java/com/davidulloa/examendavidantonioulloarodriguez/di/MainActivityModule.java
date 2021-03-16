package com.davidulloa.examendavidantonioulloarodriguez.di;


import com.davidulloa.examendavidantonioulloarodriguez.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract MainActivity contributeMaibnActivity();
}

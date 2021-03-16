package com.davidulloa.examendavidantonioulloarodriguez.di;


import com.davidulloa.examendavidantonioulloarodriguez.ui.MarcasFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract MarcasFragment contributeHomeFragment();

}

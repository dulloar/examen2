package com.davidulloa.examendavidantonioulloarodriguez.di;


import com.davidulloa.examendavidantonioulloarodriguez.LoginActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class LoginAcivityModule {
    @ContributesAndroidInjector
    abstract LoginActivity contributeLoginActivity();
}

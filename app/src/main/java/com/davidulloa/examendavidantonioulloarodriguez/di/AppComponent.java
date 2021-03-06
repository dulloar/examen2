package com.davidulloa.examendavidantonioulloarodriguez.di;

import android.app.Application;

import com.davidulloa.examendavidantonioulloarodriguez.LoginActivity;
import com.davidulloa.examendavidantonioulloarodriguez.app.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class,
                        AppModule.class
                        , MainActivityModule.class
                        })
public interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    void inject(App App);
}

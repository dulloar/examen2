package com.davidulloa.examendavidantonioulloarodriguez.di;

import com.davidulloa.examendavidantonioulloarodriguez.LoginActivity;

import dagger.Component;


@Component(dependencies = AppComponent.class,modules = {LoginActivityModule.class})
public interface LoginComponent {
    @Component.Factory
    interface Factory {
        LoginComponent create(AppComponent appComponent);
    }

    void inject(LoginActivity loginActivity);
}

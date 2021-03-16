package com.davidulloa.examendavidantonioulloarodriguez.app;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static  App instance;
    public static App getIntance() {
        return instance;
    }

    public static Context getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }
}

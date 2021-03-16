package com.davidulloa.examendavidantonioulloarodriguez.data.remote;

import com.davidulloa.examendavidantonioulloarodriguez.Constants;
import com.davidulloa.examendavidantonioulloarodriguez.common.SharedPreferencesManager;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request().newBuilder().addHeader("Authorization", "Basic "+Constants.TOKEN).build();
        return chain.proceed(request);
    }
}

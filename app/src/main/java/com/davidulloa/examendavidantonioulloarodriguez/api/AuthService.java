package com.davidulloa.examendavidantonioulloarodriguez.api;

import androidx.lifecycle.LiveData;

import com.davidulloa.examendavidantonioulloarodriguez.data.remote.RequestLogin;
import com.davidulloa.examendavidantonioulloarodriguez.data.remote.response.ResponseAuth;

import retrofit2.http.POST;
import retrofit2.http.Part;

public interface AuthService {

    @POST("oauth/token")
    LiveData<ResponseAuth> singIn(RequestLogin resuqestLogin);
}

package com.davidulloa.examendavidantonioulloarodriguez.data.repository;

import androidx.lifecycle.LiveData;

import com.davidulloa.examendavidantonioulloarodriguez.AppExecutors;
import com.davidulloa.examendavidantonioulloarodriguez.api.AuthService;
import com.davidulloa.examendavidantonioulloarodriguez.data.remote.RequestLogin;
import com.davidulloa.examendavidantonioulloarodriguez.data.remote.models.Usuario;
import com.davidulloa.examendavidantonioulloarodriguez.data.remote.response.ResponseAuth;

import javax.inject.Inject;

public class UsuarioRepository {
    private AuthService authService;
    private AppExecutors appExecutors;

    @Inject
    UsuarioRepository(AppExecutors appExecutors, AuthService authService){
        this.appExecutors = appExecutors;
        this.authService = authService;
    }

    public LiveData<ResponseAuth> getResponseAuth(Usuario usuario){
        RequestLogin requestLogin = new RequestLogin();
        requestLogin.setUsuario(usuario.getUsuario());
        requestLogin.setClave(usuario.getClave());
        return authService.singIn(requestLogin);
    }
}

package com.davidulloa.examendavidantonioulloarodriguez.viewmodel;

import android.content.Context;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;

import com.davidulloa.examendavidantonioulloarodriguez.api.AuthService;
import com.davidulloa.examendavidantonioulloarodriguez.common.SharedPreferencesManager;
import com.davidulloa.examendavidantonioulloarodriguez.data.remote.models.Usuario;
import com.davidulloa.examendavidantonioulloarodriguez.data.repository.UsuarioRepository;

import java.security.MessageDigest;

import javax.inject.Inject;

public class UsuarioViewModel extends ViewModel {
    private UsuarioRepository usuarioRepository;


    @Inject
    public UsuarioViewModel(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public boolean validarLogin(Usuario usuario, Context context){
        usuario.setClave(sha256(usuario.getClave()));
        final boolean[] autenticado = new boolean[1];
        usuarioRepository.getResponseAuth(usuario).observe((LifecycleOwner) context, responseAuth -> {
            if(responseAuth.getAccess_token() != null && !responseAuth.getAccess_token().isEmpty()){
                autenticado[0] = true;
            }else{
                autenticado[0] = false;
            }
            SharedPreferencesManager.setSomeStringValue("token",responseAuth.getAccess_token());
            SharedPreferencesManager.setSomeStringValue("refresh",responseAuth.getRefresh_token());
        });
        return autenticado[0];
    }

    private String sha256(final String base) {
        try{
            final MessageDigest digest = MessageDigest.getInstance("SHA-256");
            final byte[] hash = digest.digest(base.getBytes("UTF-8"));
            final StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                final String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}

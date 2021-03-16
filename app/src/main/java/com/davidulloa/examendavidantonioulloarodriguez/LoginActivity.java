package com.davidulloa.examendavidantonioulloarodriguez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.davidulloa.examendavidantonioulloarodriguez.data.remote.models.Usuario;
import com.davidulloa.examendavidantonioulloarodriguez.databinding.ActivityLoginBinding;
import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.UsuarioViewModel;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding loginBinding;
    private UsuarioViewModel usuarioViewModel;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);
        usuarioViewModel = ViewModelProviders.of(this).get(UsuarioViewModel.class);
        loginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        usuario = new Usuario();
        usuario.setUsuario( loginBinding.editTextEmail.getText().toString());
        usuario.setClave(loginBinding.editTextPassword.getText().toString());
        loginBinding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usuarioViewModel.validarLogin(usuario,LoginActivity.this)){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    loginBinding.editTextEmail.setError("Usuario o contraseña incorrectos");
                    loginBinding.editTextPassword.setError("Usuario o contraseña incorrectos");
                }
            }
        });
    }
}
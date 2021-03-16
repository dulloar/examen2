package com.davidulloa.examendavidantonioulloarodriguez;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;
import com.davidulloa.examendavidantonioulloarodriguez.databinding.ActivityRecargaBinding;

public class RecargaActivity extends AppCompatActivity {

    private ActivityRecargaBinding binding;
    private Recarga recarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recarga);
        recarga = new Recarga();
        binding.bRecarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            recarga.setMonto(Double.valueOf(binding.cantidad.getText().toString()));
            recarga.setNumero(Integer.valueOf(binding.edNumero.getText().toString()));

            }
        });
    }
}
package com.davidulloa.examendavidantonioulloarodriguez;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;
import com.davidulloa.examendavidantonioulloarodriguez.databinding.ActivityRecargaBinding;
import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.RecargaViewModel;

public class RecargaActivity extends AppCompatActivity {

    private ActivityRecargaBinding binding;
    private RecargaViewModel recargaViewModel;
    private Recarga recarga;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        recargaViewModel = ViewModelProviders.of(this).get(RecargaViewModel.class);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recarga);
        recarga = new Recarga();
        binding.bRecarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            recarga.setMonto(Double.valueOf(binding.cantidad.getText().toString()));
            recarga.setNumero(Integer.valueOf(binding.edNumero.getText().toString()));
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                alertDialog.setTitle("Recarga");

                alertDialog.setMessage("¿La cantidad es la correcta?").setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    recargaViewModel.GuardarRecarga(recarga);
                }
            });
                alertDialog.setCancelable(false).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
                alertDialog.show();
            }
        });
    }
}
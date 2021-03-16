package com.davidulloa.examendavidantonioulloarodriguez.adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import com.davidulloa.examendavidantonioulloarodriguez.R;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Accion;
import com.davidulloa.examendavidantonioulloarodriguez.databinding.MarcaAccionBinding;
import com.davidulloa.examendavidantonioulloarodriguez.ui.common.DataBoundListAdapter;

import java.util.List;
import java.util.Objects;

public class MarcasAdapter extends DataBoundListAdapter<Accion, MarcaAccionBinding> {

    private List<Accion> accions;
    private Context context;
    private MarcaAccionBinding binding;
    private IMarca iMarca;

    private final androidx.databinding.DataBindingComponent dataBindingComponent;

    public MarcasAdapter(List<Accion> accions,DataBindingComponent dataBindingComponent, IMarca iMarca) {
        this.accions = accions;
        this.dataBindingComponent = dataBindingComponent;
        this.iMarca = iMarca;
    }

    @Override
    protected MarcaAccionBinding createBinding(ViewGroup parent) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.marca_accion,parent,false,dataBindingComponent);
        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Accion accion = binding.getAccion();
                iMarca.onCllick(accion);
            }
        });
        return binding;
    }

    @Override
    protected void bind(MarcaAccionBinding binding, Accion item) {
        binding.setAccion(item);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected boolean areItemsTheSame(Accion oldItem, Accion newItem) {
        return Objects.equals(oldItem.getId(),newItem.getId());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected boolean areContentsTheSame(Accion oldItem, Accion newItem) {
        return Objects.equals(oldItem.getId(),newItem.getId());
    }
    public interface IMarca {
        void onCllick(Accion accion);
    }
}

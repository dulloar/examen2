package com.davidulloa.examendavidantonioulloarodriguez.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.bumptech.glide.load.engine.Resource;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Accion;
import com.davidulloa.examendavidantonioulloarodriguez.data.repository.AccionRepository;

import java.util.List;

import javax.inject.Inject;

public class AccionViewModel extends ViewModel {

    private final LiveData<List<Accion>> acciones;
    private final AccionRepository entronqueRepository;

    @Inject
    AccionViewModel(AccionRepository repository){
        this.entronqueRepository = repository;
        this.acciones = repository.getAcciones();
    }


    public LiveData<List<Accion>> getEntronques() { return acciones;}
}

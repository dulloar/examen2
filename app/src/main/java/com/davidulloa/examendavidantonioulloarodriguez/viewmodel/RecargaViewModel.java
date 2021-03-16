package com.davidulloa.examendavidantonioulloarodriguez.viewmodel;

import androidx.lifecycle.ViewModel;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;
import com.davidulloa.examendavidantonioulloarodriguez.data.repository.RecargaRepository;

import javax.inject.Inject;

public class RecargaViewModel extends ViewModel {
    private RecargaRepository repository;

    @Inject
    public RecargaViewModel(RecargaRepository repository) {
        this.repository = repository;
    }

    public void GuardarRecarga(Recarga recarga){

    }
}

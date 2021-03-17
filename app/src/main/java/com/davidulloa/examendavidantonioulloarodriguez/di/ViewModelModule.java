package com.davidulloa.examendavidantonioulloarodriguez.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Recarga;
import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.MarcaViewModel;
import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.RecargaViewModel;
import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class ViewModelModule {

    @SuppressWarnings("unused")
    @Binds
    @IntoMap
    @ViewModelKey(MarcaViewModel.class)
    abstract ViewModel bindMarcaViewModel(MarcaViewModel marcaViewModel);

    @SuppressWarnings("unused")
    @Binds
    @IntoMap
    @ViewModelKey(RecargaViewModel.class)
    abstract ViewModel bindRecargaViewModel(RecargaViewModel recargaViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}

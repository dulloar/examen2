package com.davidulloa.examendavidantonioulloarodriguez.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.davidulloa.examendavidantonioulloarodriguez.R;
import com.davidulloa.examendavidantonioulloarodriguez.RecargaActivity;
import com.davidulloa.examendavidantonioulloarodriguez.adapter.MarcasAdapter;
import com.davidulloa.examendavidantonioulloarodriguez.bindnig.FragmentDataBindingComponent;
import com.davidulloa.examendavidantonioulloarodriguez.data.local.models.Accion;
import com.davidulloa.examendavidantonioulloarodriguez.databinding.FragmentMarcasBinding;
import com.davidulloa.examendavidantonioulloarodriguez.util.AutoClearedValue;
import com.davidulloa.examendavidantonioulloarodriguez.viewmodel.AccionViewModel;

import java.util.List;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MarcasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MarcasFragment extends Fragment implements MarcasAdapter.IMarca {

    @Inject
    ViewModelProvider.Factory viewModelProvider;

    androidx.databinding.DataBindingComponent dataBindingComponent = new FragmentDataBindingComponent(this);
    AutoClearedValue<FragmentMarcasBinding> binding;

    private List<Accion> acciones;
    private MarcasAdapter adapter;
    private AccionViewModel accionViewModel;
    public MarcasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MarcasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MarcasFragment newInstance(String param1, String param2) {
        MarcasFragment fragment = new MarcasFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentMarcasBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_marcas, container, false, dataBindingComponent);

        binding = new AutoClearedValue<>(this,mBinding);

        adapter = new MarcasAdapter(acciones,dataBindingComponent,this);

        binding.get().rvMarcas.setAdapter(adapter);
        binding.get().rvMarcas.setLayoutManager(new GridLayoutManager(getContext(),3));
        // Inflate the layout for this fragment
        return binding.get().getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        accionViewModel = ViewModelProviders.of(this,viewModelProvider).get(AccionViewModel.class);

        accionViewModel.getEntronques().observe(getViewLifecycleOwner(),accionesO -> {
            if(acciones != null){
                acciones = accionesO;
            }
        });
    }

    @Override
    public void onCllick(Accion accion) {
        Intent intent = new Intent(getActivity(), RecargaActivity.class);
        intent.putExtra("Accion",accion.getId());
        intent.putExtra("Marca",accion.getMarca());
        startActivity(intent);
    }
}
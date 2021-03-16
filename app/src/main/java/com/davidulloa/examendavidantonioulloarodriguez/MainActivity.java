package com.davidulloa.examendavidantonioulloarodriguez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.davidulloa.examendavidantonioulloarodriguez.databinding.ActivityMainBinding;
import com.davidulloa.examendavidantonioulloarodriguez.ui.MarcasFragment;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(mainBinding.container.getId(),new MarcasFragment()).commitNow();
    }
}
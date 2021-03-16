package com.davidulloa.examendavidantonioulloarodriguez.bindnig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;

public class ActivityDataBindingComponents implements DataBindingComponent {

    private final ActivityBindingAdapters adapters;

    public ActivityDataBindingComponents(AppCompatActivity activity) {
        this.adapters = new ActivityBindingAdapters(activity);
    }

    @Override
    public ActivityBindingAdapters getActivityBindingAdapters() {
        return adapters;
    }
}

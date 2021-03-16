package com.davidulloa.examendavidantonioulloarodriguez.bindnig;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.davidulloa.examendavidantonioulloarodriguez.R;

import javax.inject.Inject;

public class ActivityBindingAdapters {
    final AppCompatActivity activity;

    @Inject
    public ActivityBindingAdapters(AppCompatActivity activity){
        this.activity = activity;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @BindingAdapter("iconMarca")
    public void bindImage(ImageView imageView, int marca){
        Drawable resource;
        switch (marca){
            case 1:
                resource = activity.getResources().getDrawable(R.drawable.ic_claro,null);
                break;
            case 2:
                resource = activity.getResources().getDrawable(R.drawable.ic_entel,null);
                break;
            default:
                resource = activity.getResources().getDrawable(R.drawable.ic_logo_tuenti,null);
                break;
        }
        Glide.with(activity).load(resource).into(imageView);
    }
}

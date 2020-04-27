package com.kroegerama.imgpicker.demo.first_time;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kroegerama.imgpicker.demo.R;

public class Tutorial extends Fragment {

    private int mPosition ;

    private ImageView image_step;

    public Tutorial(int position) {
        mPosition = position;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tutorial, container, false);
        image_step = view.findViewById(R.id.img_step);
        if (mPosition == 0) {
            image_step.setImageResource(R.drawable.android_1);
        }
        if (mPosition == 1) {
            image_step.setImageResource(R.drawable.android_2);
        }
        if (mPosition == 2) {
            image_step.setImageResource(R.drawable.android_3);
        }
        return view;
    }
}

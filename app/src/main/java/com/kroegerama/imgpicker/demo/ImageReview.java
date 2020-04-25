package com.kroegerama.imgpicker.demo;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;

import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageReview extends Fragment {

    private ImageView imageView;

    private Size desiredSize;
    private int layout;
    private Uri uri;

    public ImageReview (){}

    @SuppressLint("ValidFragment")
    public ImageReview( final Size desiredSize, Uri uri) {
        this.desiredSize = desiredSize;
        this.uri = uri;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_review, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        imageView = (ImageView) view.findViewById(R.id.img_review);
        Log.e("this uri run", this.uri.toString());
        imageView.setImageURI(this.uri);
    }
}

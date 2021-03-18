package com.example.myinstaprogramexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    private View view;
    private ImageView f1_image_pic;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);
        f1_image_pic = view.findViewById(R.id.f1_image_pic);
        f1_image_pic.setOnClickListener(v -> {
            Toast.makeText(view.getContext(), "앙 기모리", Toast.LENGTH_SHORT).show();
        });




        return view;
    }
}

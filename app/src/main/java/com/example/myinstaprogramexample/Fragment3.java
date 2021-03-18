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

public class Fragment3 extends Fragment {
    private View view;
    private ImageView f3_image_pic;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);
        f3_image_pic = view.findViewById(R.id.f3_image_pic);
        f3_image_pic.setOnClickListener(v -> {
            Toast.makeText(view.getContext(), "zhu ni sheng ri kuai le!", Toast.LENGTH_SHORT).show();
        });




        return view;
    }
}


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

public class Fragment2 extends Fragment {
    private View view;
    private ImageView f2_image_pic;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);
        f2_image_pic = view.findViewById(R.id.f2_image_pic);
        f2_image_pic.setOnClickListener(v -> {
            Toast.makeText(view.getContext(), "Let It Go~", Toast.LENGTH_SHORT).show();
        });




        return view;
    }
}

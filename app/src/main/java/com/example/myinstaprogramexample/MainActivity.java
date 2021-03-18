package com.example.myinstaprogramexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView btnMenu;
    private FrameLayout frameLayout;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewByIdFunc();
        eventHandleFunc();
    }

    private void eventHandleFunc() {
        btnMenu.setOnNavigationItemSelectedListener((item) -> {
                switch (item.getItemId())
                {
                    case R.id.action_1: setFragmentChange(1); break;
                    case R.id.action_2: setFragmentChange(2); break;
                    case R.id.action_3: setFragmentChange(3); break;
                    case R.id.action_4: setFragmentChange(4); break;
                }

                return false;
        });
        setFragmentChange(1);
    }

    public void setFragmentChange(int i) {
        //1. 프래그먼트 매니저를 가져와야한다.
        FragmentManager fm = getSupportFragmentManager();
        //2. 매니저에게 트랜젝션 시작명령을 내린다. -> commit 명령이 떨어진다.
        FragmentTransaction ft = fm.beginTransaction();
        //3.프래그먼트 레이아웃 화면을 전환시킨다.
        switch (i)
        {
            case 1: ft.replace(R.id.frameLayout, fragment1);
            ft.commit();
            break;
            case 2: ft.replace(R.id.frameLayout, fragment2);
            ft.commit();
            break;
            case 3: ft.replace(R.id.frameLayout, fragment3);
            ft.commit();
            break;
            case 4: ft.replace(R.id.frameLayout, fragment4);
            ft.commit();
            break;
        }
    }

    private void findViewByIdFunc() {
        btnMenu = findViewById(R.id.btnMenu);
        frameLayout = findViewById(R.id.frameLayout);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
    }
}
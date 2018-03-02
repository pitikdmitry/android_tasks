package com.example.nyam.task3.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nyam.task3.R;

public class BlueFragment extends BaseFragment {
    private BlueListener cooperationListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
//        наш фарагмент может работать только с этими активи
        cooperationListener = (BlueListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blue_box, container, false);
        view.findViewById(R.id.btn_fragment_blue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cooperationListener.blueToGreen();
            }
        });
        return view;
    }

    public interface BlueListener {
        void blueToGreen();

    }
}


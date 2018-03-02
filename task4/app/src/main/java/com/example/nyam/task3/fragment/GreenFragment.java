package com.example.nyam.task3.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nyam.task3.R;

public class GreenFragment extends BaseFragment {
    private GreenListener cooperationListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
//        наш фарагмент может работать только с этими активи
        cooperationListener = (GreenListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_green_box, container, false);
        view.findViewById(R.id.btn_fragment_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cooperationListener.greenToBlue();
            }
        });
        return view;
    }

    public interface GreenListener {
        void greenToBlue();

    }
}



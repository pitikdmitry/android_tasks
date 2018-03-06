package com.example.nyam.task3;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nyam.task3.fragment.BlueFragment;
import com.example.nyam.task3.fragment.GreenFragment;

public class MainActivity extends AppCompatActivity
        implements BlueFragment.BlueListener, GreenFragment.GreenListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        fragmentManager = getSupportFragmentManager();

        fragmentManager
                .beginTransaction()
                .replace(R.id.top_layout, new GreenFragment(), "top")
                .commit();
    }

    @Override
    public void blueToGreen() {

        fragmentManager.beginTransaction()
                .remove(fragmentManager.findFragmentById(R.id.bottom_layout))
                .replace(R.id.top_layout, new GreenFragment(), "top")
                .commit();
    }

    @Override
    public void greenToBlue() {

        fragmentManager
                .beginTransaction()
                .remove(fragmentManager.findFragmentById(R.id.top_layout))
                .replace(R.id.bottom_layout, new BlueFragment(), "bottom")
                .commit();
    }




















}

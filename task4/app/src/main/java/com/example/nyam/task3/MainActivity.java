package com.example.nyam.task3;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Toast;

import com.example.nyam.task3.fragment.BlueFragment;
import com.example.nyam.task3.fragment.GreenFragment;

public class MainActivity extends AppCompatActivity implements BlueFragment.BlueListener, GreenFragment.GreenListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.container, new GreenFragment()) ;

        transaction.commit();

    }

    @Override
    public void blueToGreen() {
           FragmentManager fragmentManager = getSupportFragmentManager();
           FragmentTransaction transaction = fragmentManager.beginTransaction();

           transaction.replace(R.id.container, new GreenFragment()) ;

           transaction.commit();

    }

    @Override
    public void greenToBlue() {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.container, new BlueFragment()) ;

        transaction.commit();


    }




















}

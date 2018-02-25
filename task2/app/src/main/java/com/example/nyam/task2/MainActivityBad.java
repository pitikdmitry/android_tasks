package com.example.nyam.task2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nyam on 22.02.18.
 */

public class MainActivityBad extends AppCompatActivity {
    public TextView waitView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bad);
    }
}

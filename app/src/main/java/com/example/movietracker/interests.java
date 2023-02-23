package com.example.movietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class interests extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        gridView=findViewById(R.id.gridviewInterests);

        ArrayList<GridModelClass> modelClassArrayList = new ArrayList<GridModelClass>();

        modelClassArrayList.add(new GridModelClass("text", /*image source*/ R.drawable.));

        myGridAdapter myGridAdapter = new myGridAdapter(this,modelClassArrayList);
        gridView.setAdapter(myGridAdapter);
    }
}
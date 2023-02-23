package com.example.movietracker;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Homefragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Homefragment extends android.app.Fragment {

    RecyclerView recyclerView;
    Integer[] image={R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon,
            R.drawable.soccer_football_icon,R.drawable.football_icon};
    String[] name={"1","2","1","2","1","2","1","2","1","2","1","2",
            "1","2","1","2","1","2","1","2",};
    LinearLayoutManager linearLayoutManager;
    cardAdapter cardAdapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Homefragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Homefragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Homefragment newInstance(String param1, String param2) {
        Homefragment fragment = new Homefragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        setHasOptionsMenu(true);

    }

    public void setContentView(int fragment_homefragment) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homefragment, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        setContentView(R.layout.fragment_homefragment);
        recyclerView = recyclerView.findViewById(R.id.recyclerView);

        linearLayoutManager = new LinearLayoutManager((Activity) getContext(),LinearLayoutManager.HORIZONTAL,false);
        cardAdapter = new cardAdapter(image,name);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(cardAdapter);

        super.onActivityCreated(savedInstanceState);
    }


    public void onPointerCaptureChanged(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }
}
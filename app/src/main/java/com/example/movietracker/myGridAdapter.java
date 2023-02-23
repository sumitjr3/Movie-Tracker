package com.example.movietracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myGridAdapter extends ArrayAdapter<GridModelClass> {


    public myGridAdapter(@NonNull Context context, ArrayList<GridModelClass> modelClassArrayList) {
        super(context, 0,modelClassArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemview = convertView;
        if (listitemview == null) {
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.my_grid_view, parent, false);
        }

        GridModelClass gridModelClass = getItem(position);
        TextView textView = listitemview.findViewById(R.id.textviewMygrid);
        ImageView imageView = listitemview.findViewById(R.id.imageviewMygrid);

        textView.setText(gridModelClass.getCourse_name());
        imageView.setImageResource(gridModelClass.getImgid());

        return listitemview;
    }
}

package com.example.movietracker;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.cardViewHolder>{

    Integer[] image;
    String[] name;

    public cardAdapter(Integer[] image,String[] name){
        super();
        this.name=name;
        this.image=image;
    }

    @NonNull
    @Override
    public cardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mycardview,parent,false);
        return new cardViewHolder(view);
    }

    Context context;
    @Override
    public void onBindViewHolder(@NonNull cardViewHolder holder, int position) {
        holder.textView.setText(name[position]);
        holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }



    public class cardViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public cardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageviewMycard);
            textView = itemView.findViewById(R.id.textviewMycard);
        }
    }
}

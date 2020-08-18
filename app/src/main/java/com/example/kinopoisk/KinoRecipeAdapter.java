package com.example.kinopoisk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KinoRecipeAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kino, parent, false);
        KinoRecipeViewHolder kinoRecipeViewHolder = new KinoRecipeViewHolder(view);
        return  kinoRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class KinoRecipeViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView title;
        public TextView description;

        public KinoRecipeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

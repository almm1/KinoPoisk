package com.example.kinopoisk;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KinoAdapter extends RecyclerView.Adapter<KinoAdapter.KinoViewHolder> {

    ArrayList<KinoRecyclerView> kinoRecyclerViews;
    Context context;

    public KinoAdapter(ArrayList<KinoRecyclerView> kinoRecyclerViews, Context context) {
        this.kinoRecyclerViews = kinoRecyclerViews;
        this.context = context;
    }

    @NonNull
    @Override
    public KinoAdapter.KinoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kino, parent, false);
        KinoViewHolder kinoViewHolder = new KinoViewHolder(view);
        return  kinoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KinoViewHolder holder, int position) {

        KinoRecyclerView kinoRecyclerView = kinoRecyclerViews.get(position);

        holder.image.setImageResource(kinoRecyclerView.getImage());
        holder.title.setText(kinoRecyclerView.getTitle());
        holder.description.setText(kinoRecyclerView.getDescription());
    }

    @Override
    public int getItemCount() {
        return kinoRecyclerViews.size();
    }

    class KinoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView image;
        public TextView title;
        public TextView description;

        public KinoViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            image = itemView.findViewById(R.id.image);
            title =itemView.findViewById(R.id.titleText);
            description=itemView.findViewById(R.id.descriptionText);
        }

        @Override
        public void onClick(View view) {

            KinoRecyclerView kinoRecyclerView = kinoRecyclerViews.get(getAdapterPosition());
            Intent intent = new Intent(context, ActivityStoryLine.class);
            intent.putExtra("image", kinoRecyclerView.getImage());
            intent.putExtra("title", kinoRecyclerView.getTitle());
            intent.putExtra("description", kinoRecyclerView.getDescription());
            intent.putExtra("storyline", kinoRecyclerView.getStoryline());
            context.startActivity(intent);
        }
    }
}

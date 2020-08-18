package com.example.kinopoisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityStoryLine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_line);

        TextView title = findViewById(R.id.titleText2);
        TextView description= findViewById(R.id.descriptionText2);
        TextView storyline = findViewById(R.id.storyline);
        ImageView image = findViewById(R.id.iconImage);

        Intent intent = getIntent();
        if (intent!=null){
            title.setText(intent.getStringExtra("title"));
            description.setText(intent.getStringExtra("description"));
            storyline.setText(intent.getStringExtra("storyline"));
            image.setImageResource(intent.getIntExtra("image", 0));
        }
    }
}
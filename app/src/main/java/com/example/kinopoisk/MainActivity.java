package com.example.kinopoisk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<KinoRecyclerView> kinoArrayList = new ArrayList<>();
        kinoArrayList.add(new KinoRecyclerView(R.drawable.pobeg_iz_shoush_01, Utils.FILM_1_TITLE, Utils.FILM_1_DESCRIPTION, Utils.FILM_1_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.zelenaya_milya_02, Utils.FILM_2_TITLE, Utils.FILM_2_DESCRIPTION, Utils.FILM_2_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.forest_gamp_03, Utils.FILM_3_TITLE, Utils.FILM_3_DESCRIPTION, Utils.FILM_3_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.spisok_shindlera_04, Utils.FILM_4_TITLE, Utils.FILM_4_DESCRIPTION, Utils.FILM_4_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.odin_plus_odin_05, Utils.FILM_5_TITLE, Utils.FILM_5_DESCRIPTION, Utils.FILM_5_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.nachalo_06, Utils.FILM_6_TITLE, Utils.FILM_6_DESCRIPTION, Utils.FILM_6_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.leon_07, Utils.FILM_7_TITLE, Utils.FILM_7_DESCRIPTION, Utils.FILM_7_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.korol_lev_08, Utils.FILM_8_TITLE, Utils.FILM_8_DESCRIPTION, Utils.FILM_8_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.boytsovskiy_club_09, Utils.FILM_9_TITLE, Utils.FILM_9_DESCRIPTION, Utils.FILM_9_STORYLINE));
        kinoArrayList.add(new KinoRecyclerView(R.drawable.ivan_vasilevich_10, Utils.FILM_10_TITLE, Utils.FILM_10_DESCRIPTION, Utils.FILM_10_STORYLINE));
    }
}
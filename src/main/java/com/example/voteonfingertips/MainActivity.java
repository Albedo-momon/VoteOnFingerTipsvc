package com.example.voteonfingertips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.voteonfingertips.adapters.GridAdapters;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    List<String> titles, title;
    List<String> marTitles;
    List<Integer> images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridview);
        titles = new ArrayList<>();
        images = new ArrayList<>();
        titles.add("Voter Registration");
        titles.add("Results");
        titles.add("Candidate Information");
        titles.add("Election");
        titles.add("Complaint");


        images.add(R.drawable.notepad);
        images.add(R.drawable.result);
        images.add(R.drawable.user);
        images.add(R.drawable.election);
        images.add(R.drawable.complaint);



        GridAdapters adapter = new GridAdapters(images, titles,this );
        gridView.setAdapter(adapter);
    }
}
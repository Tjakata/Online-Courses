package com.example.onlinecourses;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Specialization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialization);

        TextView text1 = findViewById(R.id.course_name);
        ImageView image1 = findViewById(R.id.course_image);
        TextView text2 = findViewById(R.id.course_desc);

        String name1 = getIntent().getExtras().getString("course_name");
        int image2 = getIntent().getExtras().getInt("course_image");
        String name2 = getIntent().getExtras().getString("course_desc");

        text1.setText(name1);
        image1.setImageResource(image2);
        text2.setText(name2);
    }
}
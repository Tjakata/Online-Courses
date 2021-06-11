package com.example.onlinecourses;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.butnDS);
        Button button2 = findViewById(R.id.butnMAD);
        Button button3 = findViewById(R.id.butnFEWD);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Specialization.class);
            intent.putExtra("course_name", "Data Science");
            intent.putExtra("course_image", R.drawable.datascience_pdusit_stock);
            intent.putExtra("course_desc", "Data science is an interdisciplinary field that uses scientific methods, processes, algorithms and systems to extract knowledge and insights from structured and unstructured data, and apply knowledge and actionable insights from data across a broad range of application domains");
            startActivity(intent);
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Specialization.class);
            intent.putExtra("course_name", "Mobile App development");
            intent.putExtra("course_image", R.drawable.pixabay_smartphone);
            intent.putExtra("course_desc", "Mobile application development is the process to making software for smartphones and digital assistants, most commonly for Android and iOS. The software can be preinstalled on the device, downloaded from a mobile app store or accessed through a mobile web browser.");
            startActivity(intent);
        });

        button3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Specialization.class);
            intent.putExtra("course_name", "Front-End Web Development");
            intent.putExtra("course_image", R.drawable.web_developer_bootcamp);
            intent.putExtra("course_desc", "Front-end web development is the practice of converting data to a graphical interface, through the use of HTML, CSS, and JavaScript, so that users can view and interact with that data");
            startActivity(intent);
        });

    }
}
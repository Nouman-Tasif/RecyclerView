package com.noumantasif.recyclerview_191175;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.noumantasif.recyclerview_191175.Adaptor.RecyclerviewAdaptor;
import com.noumantasif.recyclerview_191175.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> studentList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerviewAdaptor recyclerviewAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcyclrview);
        studentList.add(new Student("Sabtain","191175"));
        studentList.add(new Student("Abdullah","191176"));
        studentList.add(new Student("Nouman","191177"));
        studentList.add(new Student("Arslan","191178"));
        studentList.add(new Student("Atif","191179"));
        studentList.add(new Student("Zeeshan","191180"));
        studentList.add(new Student("Tasif","191181"));
        studentList.add(new Student("Adil","191182"));
                       studentList.add(new Student("Zeeshan","191184"));
        recyclerviewAdaptor = new RecyclerviewAdaptor(studentList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(  recyclerviewAdaptor);
    }
}
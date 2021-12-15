package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person("추신수", "010-1717-0713"));
        adapter.addItem(new Person("최 정", "010-1414-0228"));
        adapter.addItem(new Person("김광현", "010-2933-0722"));
        adapter.addItem(new Person("김강민", "010-0000-0913"));
        adapter.addItem(new Person("박경완", "010-2626-0711"));
        adapter.addItem(new Person("김원형", "010-7016-0705"));

        recyclerView.setAdapter(adapter);

    }
}
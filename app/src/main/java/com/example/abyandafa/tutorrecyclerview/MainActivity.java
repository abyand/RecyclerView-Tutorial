    package com.example.abyandafa.tutorrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

    public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        List<String> input = new ArrayList<>();
        for(int i = 0; i<10; i++)
        {
            input.add("Test" + i);
        }
        mAdapter = new KontakAdapter(input);

        input.add("abyan");
        recyclerView.setAdapter(mAdapter);

    }

}

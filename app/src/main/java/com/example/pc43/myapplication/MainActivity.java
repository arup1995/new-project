package com.example.pc43.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Name> nameList=new ArrayList<>();
    private RecyclerView recyclerView;
    private Dashboardadapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycleview);
        madapter=new Dashboardadapter(nameList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(madapter);
        data();
    }
    public void data(){
        Name name=new Name("Arup Sarkar");
        nameList.add(name);
        name=new Name("Arup Sarkar");
        nameList.add(name);
        name=new Name("Arup Sarkar");
        nameList.add(name);
        name=new Name("Arup Sarkar");
        nameList.add(name);
        name=new Name("Arup Sarkar");
        nameList.add(name);
        madapter.notifyDataSetChanged();
    }
}
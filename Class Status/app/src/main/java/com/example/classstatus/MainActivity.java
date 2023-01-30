package com.example.classstatus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.classstatus.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;
    final List<String> names_list = Arrays.asList("Ahmad \t\t\t16.5\t\t\tGood", "Pooya \t\t\t2.25\t\t\tNot Passing", "Hirad \t\t\t15  \t\t\tSatisfactory", "Ariya \t\t\t11.5\t\t\tNot Passing", "Sina  \t\t\t20  \t\t\tExcellent", "Babak \t\t\t18  \t\t\tGood", "Parham\t\t\t4.25\t\t\tNot Passing", "Mahyar\t\t\t20  \t\t\tExcellent", "Navid \t\t\t16  \t\t\tGood", "Farid \t\t\t14.75 \t\tSatisfactory");

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //Changing layout
        binding.averageButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,ClassAverageActivity.class)));

        //adapter
        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String> (this
                ,android.R.layout.simple_list_item_1,names_list);
        listView.setAdapter(adapter);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mune,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Sort A to Z
        int id = item.getItemId();
        if (id == R.id.sort1){
            Collections.sort(names_list);
            adapter.notifyDataSetChanged();
        }
        //Sort Z to A
        else if ( id == R.id.sort2){
            Collections.sort(names_list, Collections.reverseOrder());
            adapter.notifyDataSetChanged();
        }
        return true;

    }
}
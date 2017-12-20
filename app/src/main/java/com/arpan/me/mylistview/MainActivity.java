package com.arpan.me.mylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private ListView listView;
        private String[] AnimalName;

        private int[] flags = {R.drawable.lion,R.drawable.shark,
                R.drawable.horse,R.drawable.elephant,
                R.drawable.duck,R.drawable.dog,
                R.drawable.deer,R.drawable.cat };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                AnimalName = getResources().getStringArray(R.array.Animal_Names);
        listView = (ListView) findViewById(R.id.listview1);

                CustomAdapter adapter = new CustomAdapter(this,AnimalName,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = AnimalName[position];
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_SHORT).show();
                
                
            }
        });

    }
}

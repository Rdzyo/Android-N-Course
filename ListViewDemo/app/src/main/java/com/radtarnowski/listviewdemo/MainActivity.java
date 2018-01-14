package com.radtarnowski.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

       final ArrayList<String> myFamilyMembers = new ArrayList<String>();

       myFamilyMembers.add("Rdz");
       myFamilyMembers.add("Tara");
       myFamilyMembers.add("Przemo");
       myFamilyMembers.add("Malgorzata");
       myFamilyMembers.add("Piotr");

       ArrayAdapter<String> arrayAdapter =
               new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamilyMembers);

       myListView.setAdapter(arrayAdapter);

       myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Toast.makeText(getApplicationContext(), "Hello" + myFamilyMembers.get(i), Toast.LENGTH_SHORT);
           }
       });
    }
}

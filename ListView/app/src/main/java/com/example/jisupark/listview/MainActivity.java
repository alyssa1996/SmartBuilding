package com.example.jisupark.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    String[] items= {"Mango Juice","Tomato Juice","Grape Juice","Apple Juice"};
    ListAdapter adapter = new ImageAdapter(this, items);//실제로 리스트에 들어가는 부분을 담는 것이 adapter
    ListView listView = (ListView) findViewById(R.id.listView);
    listView.setAdapter(adapter);

    listView.setOnItemClickListener(
        new AdapterView.OnItemClickListener(){
        @Override
                public void onItemClick(AdapterView<?> parent, View view, int i, long id){
                String item = String.valueOf(parent.getItemAtPosition(i));
            Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
        }
    }
    );
    }
}
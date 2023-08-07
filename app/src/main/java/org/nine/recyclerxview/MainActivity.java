package org.nine.recyclerxview;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<>();
        list.add("item a");
        list.add("item b");
        MyAdapter adapter = new MyAdapter(this, list);


        RecyclerXView recyclerXView = findViewById(R.id.x);
        recyclerXView.init();
        recyclerXView.setLayoutManager(new LinearLayoutManager(
                getApplicationContext(),
                LinearLayoutManager.VERTICAL,
                false)
        );

        System.err.println(new Handler(getMainLooper()).postDelayed(() ->
                recyclerXView.setAdapter(adapter), 2000));


    }
}
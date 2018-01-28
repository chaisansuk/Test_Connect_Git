package com.example.manitch.myapplication.basic;

import android.app.ListActivity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.manitch.myapplication.R;
import com.example.manitch.myapplication.grid_view.GridViewActivity;
import com.example.manitch.myapplication.list_view.ListViewActivity;
import com.example.manitch.myapplication.tab_view.TabViewActivity;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        Button grid = (Button) findViewById(R.id.grid);
        Button list = (Button) findViewById(R.id.list);
        Button tab = (Button) findViewById(R.id.tab);
        Button about = (Button) findViewById(R.id.about);

        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicActivity.this, TabViewActivity.class);
                startActivity(intent);
            }
        });

    }
}

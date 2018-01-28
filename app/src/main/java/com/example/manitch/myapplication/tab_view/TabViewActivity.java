package com.example.manitch.myapplication.tab_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.example.manitch.myapplication.R;

public class TabViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_view);
        TabHost tabHost = (TabHost) this.findViewById(R.id.tab);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("TAB1");
        tab1.setIndicator("TAB1");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("TAB2");
        tab2.setIndicator("TAB2");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        TabWidget tabWidget = tabHost.getTabWidget();
        tabWidget.setEnabled(true);
    }
}

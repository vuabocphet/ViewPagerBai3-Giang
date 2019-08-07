package com.example.dev.viewpager;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private ViewPager viewPager;
   private TabLayout tab;
   private MainAdapter adapter;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPaer);
        tab = findViewById(R.id.tabLayout);
        adapter = new MainAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
        textView = findViewById(R.id.position);
        textView.setText(tab.getSelectedTabPosition()+"");
        tab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               textView.setText(tab.getPosition()+"");
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}

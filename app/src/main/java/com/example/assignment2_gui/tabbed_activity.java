package com.example.assignment2_gui;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.assignment2_gui.ui.main.SectionsPagerAdapter;

public class tabbed_activity extends AppCompatActivity {

    //An array containing your icons from the drawable directory
    final int[] ICONS = new int[]{
            R.drawable.love,
            R.drawable.relative,
            R.drawable.frame,
            R.drawable.linear
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_activity);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        for (int i=0;i<ICONS.length; ++i) {
            tabs.getTabAt(i).setIcon(ICONS[i]);
        }
    }
}
package com.example.assign4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Window;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TabLayout tab;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      vp =findViewById(R.id.vp);
        tab =findViewById(R.id.tab);
       vp.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(vp);
        getSupportFragmentManager().beginTransaction().add(R.id.frame,new ChatFragment()).commit();

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition())
                {
                    case 0:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ChatFragment()).commit();

                        break;
                    case 1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new StatusFragment()).commit();

                        break;
                        case 2:
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new CallsFragment()).commit();

                            break;

                }
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
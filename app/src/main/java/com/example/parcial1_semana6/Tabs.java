package com.example.parcial1_semana6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.parcial1_semana6.Controls.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Tabs extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem ContactsTab, EmailTab, MessagesTab;
    PagerController pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvenido);
        linkingComps();

        //**** this code controls the switch fragment******//
        pagerAdapter = new PagerController(getSupportFragmentManager(),tabLayout.getTabCount());

        //***** the fragments will show in viewPager*******////
        viewPager.setAdapter(pagerAdapter);

        //******** Click event for tabs*******////
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //******* getting the position to show ******/////
                viewPager.setCurrentItem(tab.getPosition());

                //*** chose what fragment to show ****/

                if (tab.getPosition() == 0){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition() == 1){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition() == 2){
                    pagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //******* ViewPager showing the fragment selected*****////
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
    //////////////************Linking components************/////////////////

    private void  linkingComps  (){
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.pageView);
        ContactsTab = findViewById(R.id.tbContacts);
        EmailTab = findViewById(R.id.tbEmail);
        MessagesTab = findViewById(R.id.tbEmail);

    }

}
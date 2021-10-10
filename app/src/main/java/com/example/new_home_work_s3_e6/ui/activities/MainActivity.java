 package com.example.new_home_work_s3_e6.ui.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.example.new_home_work_s3_e6.R;
import com.example.new_home_work_s3_e6.databinding.ActivityMainBinding;
import com.example.new_home_work_s3_e6.ui.fragments.ImageFragment.ImageFragment;
import com.example.new_home_work_s3_e6.ui.fragments.NumberFragment.NumbersFragment;
import com.example.new_home_work_s3_e6.ui.fragments.UserFragment.UserFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

 public class  MainActivity extends AppCompatActivity {
     private ActivityMainBinding binding;
     private ViewPagerAdapter adapter;
     private ArrayList<Fragment> list;
     private String[] title = {"Exchange","Date & Time","More"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initViewPager();
    }

     private void initViewPager() {
        adapter = new ViewPagerAdapter(this);
        adapter.setList(getList());
        binding.mainViewPager.setAdapter(adapter);

        new TabLayoutMediator(binding.mainTabs, binding.mainViewPager, (tab, position) -> {
            tab.setText(title[position]);
        }).attach();

     }

     private ArrayList<Fragment> getList()
     {
         list=new ArrayList<>();
         list.add(new UserFragment());
         list.add(new NumbersFragment());
         list.add(new ImageFragment());
         return list;
     }
 }
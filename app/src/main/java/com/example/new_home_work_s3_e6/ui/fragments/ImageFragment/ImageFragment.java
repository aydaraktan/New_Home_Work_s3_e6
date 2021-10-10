package com.example.new_home_work_s3_e6.ui.fragments.ImageFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.new_home_work_s3_e6.R;
import com.example.new_home_work_s3_e6.databinding.FragmentImageBinding;

public class ImageFragment extends Fragment {
    private FragmentImageBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentImageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initListeners();
    }
    private void initListeners() {
        binding.switchMore.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                Glide.with(getContext()).load("https://www.prorobot.ru/slovarik/android/14-07-2018_07-39-07.jpg").into(binding.moreIv1);
            } else {
                Glide.with(getContext()).load("https://yt3.ggpht.com/ytc/AKedOLS2SF7GWShAo24fNcUgHqyYBc4dCqaqikWch8gQiw=s900-c-k-c0x00ffffff-no-rj").into(binding.moreIv1);
            }
        });

    }
}
package com.example.new_home_work_s3_e6.ui.fragments.NumberFragment;

import android.annotation.SuppressLint;
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
import com.example.new_home_work_s3_e6.databinding.FragmentNumbersBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NumbersFragment extends Fragment {
    private FragmentNumbersBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNumbersBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showDate();
        showImage();
    }

    private void showImage() {
        Glide.with(this).load("https://img.geliophoto.com/bishkek/00_bishkek.jpg").into(binding.mainIv);
    }
    private void showDate() {
        Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd-MM-yyyy");
        binding.dateTv.setText(dateFormat.format(calendar.getTime()));
    }
}
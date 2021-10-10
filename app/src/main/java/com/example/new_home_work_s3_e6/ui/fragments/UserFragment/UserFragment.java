package com.example.new_home_work_s3_e6.ui.fragments.UserFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.new_home_work_s3_e6.R;
import com.example.new_home_work_s3_e6.data.local.Data;
import com.example.new_home_work_s3_e6.databinding.FragmentUserBinding;

public class UserFragment extends Fragment {
private FragmentUserBinding binding;
private UserAdapter adapter ;
private Data data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUserBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecycler();
    }

    private void initRecycler() {
    adapter = new UserAdapter();
    data = new Data();
    adapter.setList(data.getList());
    binding.UserRv.setAdapter(adapter);
    }
}
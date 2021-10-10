package com.example.new_home_work_s3_e6.ui.fragments.UserFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.new_home_work_s3_e6.databinding.ItemUserRvBinding;
import com.example.new_home_work_s3_e6.models.User;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private ArrayList<User> list;
    public void setList(ArrayList<User> list)
    {
        this.list= new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemUserRvBinding binding=ItemUserRvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemUserRvBinding binding;
        public ViewHolder(@NonNull ItemUserRvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }

        public void onBind(User user) {
            binding.nameTv.setText(user.getName());
            binding.kurs.setText(user.getSurname());
            binding.ImageV.setImageResource(user.getImage());

        }
    }
}

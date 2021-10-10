package com.example.new_home_work_s3_e6.data.local;

import com.example.new_home_work_s3_e6.R;
import com.example.new_home_work_s3_e6.models.User;

import java.util.ArrayList;

public class Data {

    private ArrayList<User> list;

    public ArrayList<User> getList() {
        list= new ArrayList<>();
        list.add(new User(R.drawable.s_coin,"sssss","1.00"));
        list.add(new User(R.drawable.v_coin,"sssss","1.00"));
        list.add(new User(R.drawable.s_coin,"sssss","1.00"));
        list.add(new User(R.drawable.s_coin,"sssss","1.00"));
        list.add(new User(R.drawable.v_coin,"sssss","1.00"));
        list.add(new User(R.drawable.s_coin,"sssss","1.00"));
        list.add(new User(R.drawable.v_coin,"sssss","1.00"));

        return list;
    }
}

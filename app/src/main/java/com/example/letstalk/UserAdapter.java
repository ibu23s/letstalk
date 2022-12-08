package com.example.letstalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserHolder> {

    private ArrayList<User> users;
    private Context context;
    private OnUserClickClickListener onUserClickClickListener;

    public UsersAdapter(ArrayList<User> users, Context context, OnUserClickClickListener onUserClickClickListener) {
        this.users = users;
        this.context = context;
        this.onUserClickClickListener = onUserClickClickListener;
    }

    interface OnUserClickClickListener{
        void onUserClick(int position);
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.)
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class UserHolder extends RecyclerView.ViewHolder{
        public UserHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

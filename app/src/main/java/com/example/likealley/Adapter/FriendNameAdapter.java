package com.example.likealley.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.likealley.Model.FriendNameModel;
import com.example.likealley.R;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class FriendNameAdapter extends RecyclerView.Adapter<FriendNameAdapter.viewHolder> {

    ArrayList<FriendNameModel> list;
    Context context;

    public FriendNameAdapter(ArrayList<FriendNameModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.friendname_rv_design,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        FriendNameModel model = list.get(position);
        holder.profile.setImageResource(model.getProfile());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView profile;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.profilePic);
        }
    }
}

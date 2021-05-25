package com.example.likealley.Adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.likealley.Model.NotificationModel;
import com.example.likealley.R;

import java.util.ArrayList;

public class NotificatifyAdapter extends RecyclerView.Adapter<NotificatifyAdapter.viewHolde>{

    ArrayList<NotificationModel> list;
    Context context;

    public NotificatifyAdapter(ArrayList<NotificationModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notificatify_rv_design,parent,false);
        return new viewHolde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolde holder, int position) {
        NotificationModel model = list.get(position);
        holder.profile.setImageResource(model.getProfile());
        holder.notification.setText(Html.fromHtml(model.getNotification()));
        holder.time.setText(model.getTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolde extends RecyclerView.ViewHolder{

        ImageView profile;
        TextView notification,time;
        public viewHolde(@NonNull View itemView) {


            super(itemView);

            profile = itemView.findViewById(R.id.profilePic);
            notification  = itemView.findViewById(R.id.notification);
            time = itemView.findViewById(R.id.time);
        }
    }
}

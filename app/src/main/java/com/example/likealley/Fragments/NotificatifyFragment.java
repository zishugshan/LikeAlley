package com.example.likealley.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

import com.example.likealley.Adapter.NotificatifyAdapter;
import com.example.likealley.Model.NotificationModel;
import com.example.likealley.R;

import java.util.ArrayList;

public class NotificatifyFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<NotificationModel> list;


    public NotificatifyFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notificatify, container, false);

        recyclerView = view.findViewById(R.id.notificationRv);
        list = new ArrayList<>();
        list.add(new NotificationModel(R.drawable.new_hope,"<b>Kyzal Zyn</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.nature,"<b>Fyzal Ktac</b> mentioned you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.deaf,"<b>Jim John</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.hipster,"<b>Vyan Ilaz</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.nature1,"<b>Keily Tun</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.nature_dordogne,"<b>Sinu Yyv</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.hipster,"<b>Yuval Byt</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.deaf,"<b>Jorge Hunt</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.dennis,"<b>Keily Vin</b> mentioned you in a post","just now"));
        list.add(new NotificationModel(R.drawable.new_hope,"<b>Zal Bond</b> mentioned you in a post","just now"));

        NotificatifyAdapter adapter = new NotificatifyAdapter(list,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
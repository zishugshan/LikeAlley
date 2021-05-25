package com.example.likealley.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.likealley.Adapter.FriendNameAdapter;
import com.example.likealley.Model.FriendNameModel;
import com.example.likealley.R;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

   RecyclerView recyclerView;
   ArrayList<FriendNameModel> list;

    public ProfileFragment() {
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
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerView = view.findViewById(R.id.friendNameRv);

        list = new ArrayList<>();
        list.add(new FriendNameModel(R.drawable.profile));
        list.add(new FriendNameModel(R.drawable.profile1));
        list.add(new FriendNameModel(R.drawable.dennis));
        list.add(new FriendNameModel(R.drawable.nature));
        list.add(new FriendNameModel(R.drawable.new_hope));
        list.add(new FriendNameModel(R.drawable.hipster));
        list.add(new FriendNameModel(R.drawable.deaf));

        FriendNameAdapter adapter = new FriendNameAdapter(list,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
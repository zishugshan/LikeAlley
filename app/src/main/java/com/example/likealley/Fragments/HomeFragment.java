package com.example.likealley.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.likealley.Adapter.DashboardAdapter;
import com.example.likealley.Adapter.StoryAdapter;
import com.example.likealley.Model.DashboardModel;
import com.example.likealley.Model.StoryModel;
import com.example.likealley.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView story_rv,dashboardRv;
    ArrayList<StoryModel> list;
    ArrayList<DashboardModel> dashboardList;

    public HomeFragment() {
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
        View view =  inflater.inflate(R.layout.fragment_home, container, false);


        story_rv = view.findViewById(R.id.storyRv);
        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.dennis,R.drawable.ic_video_camera,R.drawable.cover,"Keily"));
        list.add(new StoryModel(R.drawable.new_hope,R.drawable.ic_live,R.drawable.cover,"Hanna"));
        list.add(new StoryModel(R.drawable.hipster,R.drawable.ic_video_camera,R.drawable.cover,"Jeilan"));


        StoryAdapter adapter = new StoryAdapter(list,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        story_rv.setLayoutManager(linearLayoutManager);
        story_rv.setNestedScrollingEnabled(false);
        story_rv.setAdapter(adapter);

        dashboardRv = view.findViewById(R.id.dashboardRv);

        dashboardList = new ArrayList<>();

        dashboardList.add(new DashboardModel(R.drawable.profile,R.drawable.new_hope,R.drawable.saved,"Denis Kan",
                "Live on Road","87","30","10"));

        dashboardList.add(new DashboardModel(R.drawable.deaf,R.drawable.hipster,R.drawable.saved,"Jeita San",
                "Born to help","191","50","14"));

        dashboardList.add(new DashboardModel(R.drawable.dennis,R.drawable.nature1,R.drawable.saved,"Kenzal Han",
                "Open to learn","57","10","7"));



        DashboardAdapter dashboardAdapter = new DashboardAdapter(dashboardList,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        dashboardRv.setLayoutManager(layoutManager);
        dashboardRv.setNestedScrollingEnabled(false);
        dashboardRv.setAdapter(dashboardAdapter);
        return view;
    }
}
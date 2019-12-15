package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class FragmentRecycler extends Fragment {
    private RecyclerView recyclerView;

    static Fragment newInstance(Bundle bundle) {
        FragmentRecycler currentFragment = new FragmentRecycler();
        Bundle args = new Bundle();
        args.putBundle("gettedArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewFragment = inflater.inflate(R.layout.fragment_recycler,
                container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Recycler");
        recyclerView = viewFragment.findViewById(R.id.recyclerRepair);

        initRecyclerView();
        return  viewFragment;
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(getContext(),
                RecyclerView.VERTICAL, true);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        Data data = new Data();
        MyAdapter adapter = new MyAdapter(data.getList());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public FragmentRecycler() {
        // Required empty public constructor
    }

}

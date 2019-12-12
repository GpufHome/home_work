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


public class FragmentRecyclerTwo extends Fragment {
    private RecyclerView recyclerView;
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
        DataTwo dataTwo = new DataTwo();
        MyAdapter adapter = new MyAdapter(dataTwo.getList());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

}

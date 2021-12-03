package com.example.mlesson6.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mlesson6.AdapterOfFirst;
import com.example.mlesson6.ModelForFirstFragment;
import com.example.mlesson6.R;
import com.example.mlesson6.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;
    private RecyclerView recyclerView;
    private AdapterOfFirst adapter;
    private ArrayList<ModelForFirstFragment> arrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
    }

    private ArrayList<ModelForFirstFragment> addList() {
        arrayList = new ArrayList<>();
        arrayList.add(new ModelForFirstFragment(R.drawable.ic_rect, getString(R.string.some_photos), getString(R.string.september_19)));
        arrayList.add(new ModelForFirstFragment(R.drawable.ic_rect, getString(R.string.some_photos), getString(R.string.september_19)));
        arrayList.add(new ModelForFirstFragment(R.drawable.ic_rect, getString(R.string.some_photos), getString(R.string.september_19)));
        arrayList.add(new ModelForFirstFragment(R.drawable.ic_rect, getString(R.string.some_photos), getString(R.string.september_19)));
        arrayList.add(new ModelForFirstFragment(R.drawable.ic_rect, getString(R.string.some_photos), getString(R.string.september_19)));
        arrayList.add(new ModelForFirstFragment(R.drawable.ic_rect, getString(R.string.some_photos), getString(R.string.september_19)));
        return arrayList;
    }

    private void initRecyclerView() {
        recyclerView = binding.homeFragment;
        adapter = new AdapterOfFirst();
        adapter.updateData(addList());
        recyclerView.setAdapter(adapter);
    }

}
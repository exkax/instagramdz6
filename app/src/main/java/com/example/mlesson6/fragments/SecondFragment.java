package com.example.mlesson6.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mlesson6.AdapterOfSecond;
import com.example.mlesson6.ModelForSecondFragment;
import com.example.mlesson6.R;
import com.example.mlesson6.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private AdapterOfSecond adapter;
    private ArrayList<ModelForSecondFragment> arrayList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new AdapterOfSecond();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
    }

    private ArrayList<ModelForSecondFragment> addList() {
        arrayList = new ArrayList<>();
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
          arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
          arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        arrayList.add(new ModelForSecondFragment(getString(R.string.karennne_liked_your_photo), getString(R.string._1h), R.drawable.img_2, R.drawable.ic_rect2));
        return arrayList;
    }

    private void initRecyclerView() {
        adapter.updateData(addList());
        binding.rvSecondFragment.setAdapter(adapter);
    }
}
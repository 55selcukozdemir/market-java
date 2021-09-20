package com.example.market.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.market.R;
import com.example.market.databinding.FragmentMainSaleBinding;


public class MainSaleFragment extends Fragment {

    public FragmentMainSaleBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentMainSaleBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }
}
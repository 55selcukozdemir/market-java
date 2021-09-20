package com.example.market.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.market.R;
import com.example.market.databinding.FragmentConditionStockBinding;


public class ConditionStockFragment extends Fragment {

    public FragmentConditionStockBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentConditionStockBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }
}
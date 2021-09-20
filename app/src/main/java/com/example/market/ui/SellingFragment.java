package com.example.market.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.market.R;
import com.example.market.databinding.FragmentSellingBinding;


public class SellingFragment extends Fragment {

    public FragmentSellingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSellingBinding.inflate(getLayoutInflater());

        return binding.getRoot();
    }
}
package com.example.market.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.market.R;
import com.example.market.adapter.SaleInEndAdapter;
import com.example.market.databinding.FragmentSellingBinding;
import com.example.market.product.SaleInEnd;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;


public class SellingFragment extends Fragment {

    public FragmentSellingBinding binding;

    public LinearLayout linearLayout;
    public Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSellingBinding.inflate(getLayoutInflater());



        return binding.getRoot();
    }

}
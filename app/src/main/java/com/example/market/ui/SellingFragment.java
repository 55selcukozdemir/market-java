package com.example.market.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.market.R;
import com.example.market.databinding.FragmentSellingBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class SellingFragment extends Fragment {

    public FragmentSellingBinding binding;

    public LinearLayout linearLayout;
    public Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {




        binding = FragmentSellingBinding.inflate(getLayoutInflater());

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(container.getContext());
        bottomSheetDialog.setContentView(R.layout.bottomshet);
        bottomSheetDialog.show();

        return binding.getRoot();
    }

}
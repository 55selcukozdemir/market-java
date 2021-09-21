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

        //Fragment içine BottomSheet eklenmesi
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(container.getContext());
        bottomSheetDialog.setContentView(R.layout.bottomshet);
        bottomSheetDialog.show();
        //Fragment içine BottomSheet eklenmesi (son)


        //Bottom Sheet içine RecyclerView eklenmesi
        ArrayList<SaleInEnd> saleArrayList = new ArrayList<>();
        saleArrayList.add(new SaleInEnd("yeni","eski","devam","tamam"));
        RecyclerView mRecyclerView = bottomSheetDialog.findViewById(R.id.bottomSheetRecyclerView);
        SaleInEndAdapter saleInEndAdapter = new SaleInEndAdapter(saleArrayList,container.getContext());
        mRecyclerView.setAdapter(saleInEndAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        ////Bottom Sheet içine RecyclerView eklenmesi (son)

        return binding.getRoot();
    }

}
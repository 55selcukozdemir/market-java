package com.example.market.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.market.R;
import com.example.market.adapter.MainViewPagerAdapter;
import com.example.market.adapter.SaleInEndAdapter;
import com.example.market.databinding.FragmentNavMainSaleBinding;
import com.example.market.product.ProductList;
import com.example.market.product.SaleInEnd;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class MainSaleFragment extends Fragment {

    public FragmentNavMainSaleBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNavMainSaleBinding.inflate(getLayoutInflater());

        binding.mainFragmentGoToScuttle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Fragment içine BottomSheet eklenmesi
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(container.getContext());
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_main_scutlle);
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
            }
        });


        configureTabLayout();

        return binding.getRoot();
    }


    //Tab bar kullanımı
    private void configureTabLayout() {

        ViewPager viewPager = binding.mainFragmetViewPager;
        TabLayout tabLayout = binding.tabBarMain;

        tabLayout.setupWithViewPager(viewPager);


        MainViewPagerAdapter adapter  = new MainViewPagerAdapter(getChildFragmentManager());


        ArrayList<ProductList> mList = new ArrayList<>();
        mList.add(new ProductList("ürün","1123546464",1f,15,R.drawable.ic_menu_camera));
        mList.add(new ProductList("ürün","1123546464",1f,15,R.drawable.ic_menu_camera));
        mList.add(new ProductList("ürün","1123546464",1f,15,R.drawable.ic_menu_camera));
        mList.add(new ProductList("ürün","1123546464",1f,15,R.drawable.ic_menu_camera));
        mList.add(new ProductList("ürün","1123546464",1f,15,R.drawable.ic_menu_camera));
        mList.add(new ProductList("ürün","1123546464",1f,15,R.drawable.ic_menu_camera));
        mList.add(new ProductList("ürün","1123546464",1f,15,R.drawable.ic_menu_camera));

        Fragment b = new MainSaleGridFragment(mList);
        Fragment c = new MainSaleGridFragment(mList);
        Fragment s = new MainSaleGridFragment(mList);

        //adapter.addFrag(new Tab1Fragment(),"tab1");
        //adapter.addFrag(new Tab2Fragment(),"tab2");
        adapter.addFrag(b,"tab1");
        adapter.addFrag(c,"tab2");
        adapter.addFrag(s,"tab3");

        viewPager.setAdapter(adapter);

    }

}
package com.example.market.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.market.R;
import com.example.market.product.ProductList;

import java.util.ArrayList;

//Satış sayfasında ki Recycler View Grid Sayfasının Adapteri Bu şekilde hazırlandı.

public class MainGridViewAdapter extends RecyclerView.Adapter<MainGridViewAdapter.ViewHolder> {

    private ArrayList<ProductList> mArraylist;
    private Context context;

    public MainGridViewAdapter(ArrayList<ProductList> mArraylist, Context context) {
        this.mArraylist = mArraylist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater i = LayoutInflater.from(context);
        View contactView = i.inflate(R.layout.recyclerview_companent_grid_view_adapter,parent,false);
        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainGridViewAdapter.ViewHolder holder, int position) {

        holder.priceText.setText(mArraylist.get(position).getPrice().toString());
        holder.nameText.setText(mArraylist.get(position).getProductName());
        holder.productImage.setImageResource(mArraylist.get(position).getPictures());

    }

    @Override
    public int getItemCount() {
        return mArraylist.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView priceText, nameText;
        private ImageView productImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            priceText = itemView.findViewById(R.id.grid_view_price_text_view);
            nameText = itemView.findViewById(R.id.grid_view_name_text_view);
            productImage = itemView.findViewById(R.id.grid_view_product_image_view);
        }
    }
}

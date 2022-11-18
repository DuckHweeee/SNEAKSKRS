package com.example.sneakskrs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShoesViewHolder extends RecyclerView.ViewHolder {
    ImageView logoView;
    ImageView shoesView;
    TextView shoesNameView;
    TextView priceView;

    public ShoesViewHolder(@NonNull View itemView){
        super(itemView);
        this.logoView = (ImageView) itemView.findViewById(R.id.img_brand);
        this.shoesView = (ImageView) itemView.findViewById(R.id.img_shoes);
        this.shoesNameView = (TextView) itemView.findViewById(R.id.tv_name);
        this.priceView = (TextView) itemView.findViewById(R.id.tv_price);
    }
}

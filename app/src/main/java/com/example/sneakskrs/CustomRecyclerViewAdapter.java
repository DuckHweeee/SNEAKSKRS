package com.example.sneakskrs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<ShoesViewHolder> {
    private List<Shoes> shoes;
    private Context context;
    private LayoutInflater mLayoutInflater;

    public CustomRecyclerViewAdapter(Context context,List<Shoes> shoes){
        this.shoes = shoes;
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public ShoesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View recyclerViewItem = mLayoutInflater.inflate(R.layout.recycler_item_layout, parent, false);
        recyclerViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cliked((RecyclerView)parent,view);
            }
        });
        return new ShoesViewHolder(recyclerViewItem);
    }
    private void cliked(RecyclerView recyclerView,View itemView){
        int itemPosition = recyclerView.getChildLayoutPosition(itemView);
        Shoes shoes = this.shoes.get(itemPosition);

        Toast.makeText(this.context, shoes.toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    public void onBindViewHolder(@NonNull ShoesViewHolder holder, int position) {
        //Get shoes in shoes via position.
        Shoes shoes = this.shoes.get(position);

        int imgResId1 = this.getDrawableResIdByName(shoes.getShoesName());
        int imgResId2 = this.getDrawableResIdByName(shoes.getBrandName());
       //Bind data to view holder.
        holder.shoesView.setImageResource(imgResId1);
        holder.logoView.setImageResource(imgResId2);
        holder.shoesNameView.setText(shoes.getShoesName());
        holder.priceView.setText("Price "+ shoes.getPrice());
    }
    //Find Image ID corresponding to the name of the image
    public int getDrawableResIdByName(String resName){
        String pkgName = context.getPackageName();
        //Return 0 if not found
        int resID = context.getResources().getIdentifier(resName,"drawable",pkgName);
        return resID;
    }
    @Override
    public int getItemCount() {
        return shoes.size();
    }
}

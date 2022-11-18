package com.example.sneakskrs;

import androidx.annotation.NonNull;

public class Shoes {
    private String shoesName;
    private String brandName;
    private String imgShoes;
    private  String price;

    public Shoes(String shoesName,String imgShoes, String brandName, String price){
        this.brandName = brandName;
        this.shoesName = shoesName;
        this.imgShoes = imgShoes;
        this.price = price;
    }
    public String getShoesName(){
        return shoesName;
    }
    public void setShoesName(String shoesName){
        this.shoesName = shoesName;
    }
    public String getImgShoes(){
        return imgShoes;
    }

    public void setImgShoes(String imgShoes) {
        this.imgShoes = imgShoes;
    }

    public String getBrandName()
    {
        return brandName;

    }
    public void setBrandName(String shoesName)
    {
        this.brandName = brandName;

    }
    public String getPrice()
    {
        return price;

    }
    public void setPrice(String price)
    {
        this.price = price;
    }
    @NonNull
    @Override
    public String toString(){
        return getShoesName()+"(Price: "+getPrice()+")";
    }
}

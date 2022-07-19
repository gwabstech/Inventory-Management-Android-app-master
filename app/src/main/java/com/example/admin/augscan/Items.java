package com.example.admin.augscan;

public class Items {
    private String itemname;
    private String itemcategory;
    private String itemprice;
    private String qty;
    private String itembarcode;


public Items() {

}

public Items(String itemname,String itemcategory,String itemprice,String itembarcode,String qty){

    this.itemname=itemname;
    this.itemcategory=itemcategory;
    this.itemprice=itemprice;
    this.itembarcode= itembarcode;
    this.qty = qty;
}

    public String getQty() {
        return qty;
    }

    public String getItemname() {
        return itemname;
    }

    public String getItemcategory() {
        return itemcategory;
    }

    public String getItemprice() {
        return itemprice;
    }

    public String getItembarcode() {
        return itembarcode;
    }
}
package com.example.market.product;

public class ProductList {
    String productName;
    String barcode;
    Float price;
    int courses;
    int Pictures;

    public ProductList(String productName, String barcode, Float price, int courses, int pictures) {
        this.productName = productName;
        this.barcode = barcode;
        this.price = price;
        this.courses = courses;
        Pictures = pictures;
    }

    public String getProductName() {
        return productName;
    }

    public ProductList setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getBarcode() {
        return barcode;
    }

    public ProductList setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public ProductList setPrice(Float price) {
        this.price = price;
        return this;
    }

    public int getCourses() {
        return courses;
    }

    public ProductList setCourses(int courses) {
        this.courses = courses;
        return this;
    }

    public int getPictures() {
        return Pictures;
    }

    public ProductList setPictures(int pictures) {
        Pictures = pictures;
        return this;
    }
}

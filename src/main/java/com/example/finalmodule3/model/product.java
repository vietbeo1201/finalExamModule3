package com.example.finalmodule3.model;

public class product {
    private int productId;
    private String productName;
    private int productPrice;
    private int ProductSale;
    private int productInventory;

    product(){

    }
    public product(int productId, String productName, int productPrice, int productSale, int productInventory) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.ProductSale = productSale;
        this.productInventory = productInventory;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductSale() {
        return ProductSale;
    }

    public void setProductSale(int productSale) {
        ProductSale = productSale;
    }

    public int getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(int productInventory) {
        this.productInventory = productInventory;
    }
}

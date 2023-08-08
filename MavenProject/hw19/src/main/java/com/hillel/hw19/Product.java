package com.hillel.hw19;

public class Product {

    private String type;
    private Double price;
    private boolean discountProbably;
    private String createDate;

    public Product() {
    }

    public Product(String type, Double price) {
        this.type = type;
        this.price = price;
    }

    public Product(String type, Double price, boolean discountProbably) {
        this.type = type;
        this.price = price;
        this.discountProbably = discountProbably;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean probablyDiscount() {
        return discountProbably;
    }


    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }



}

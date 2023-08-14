package com.hillel.hw19;

import java.time.LocalDateTime;

public class Product {

    private String type;
    private Double price;
    private boolean discountProbably;
    private LocalDateTime createDate;

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

    public Product(String type, Double price, boolean discountProbably, LocalDateTime createDate) {
        this.type = type;
        this.price = price;
        this.discountProbably = discountProbably;
        this.createDate = createDate;
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


    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }



}

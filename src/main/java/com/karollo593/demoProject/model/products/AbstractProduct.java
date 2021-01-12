package com.karollo593.demoProject.model.products;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class AbstractProduct implements Serializable {
    private static final long serialVersionUID = 2L;
    private long id;
    private int category_id;
    protected LocalDate expiryDate;
    protected double price;
    protected Double total_price;
    protected int quantityStock;
    private float weight;

    public AbstractProduct(long id, int category_id, LocalDate expiryDate, double price, Double total_price, int quantityStock, float weight) {
        this.id = id;
        this.category_id = category_id;
        this.expiryDate = expiryDate;
        this.price = price;
        this.total_price = total_price;
        this.quantityStock = quantityStock;
        this.weight = weight;
    }

    protected AbstractProduct() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}

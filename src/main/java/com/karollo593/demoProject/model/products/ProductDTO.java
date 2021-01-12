package com.karollo593.demoProject.model.products;

import java.time.LocalDate;

public class ProductDTO {
    private long id;
    private int category_id;
    private String name;
    private double price;
    private float weight;
    private String url;
    private String description;
    private Double total_price;
    private int quantityStock;
    private ProductStatus status;
    protected LocalDate expiryDate;

    public ProductDTO(long id, int category_id, String name, double price, float weight, String url, String description, Double total_price, int quantityStock, ProductStatus status, LocalDate expiryDate) {
        this.id = id;
        this.category_id = category_id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.url = url;
        this.description = description;
        this.total_price = total_price;
        this.quantityStock = quantityStock;
        this.status = status;
        this.expiryDate = expiryDate;
    }

    public ProductDTO() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}

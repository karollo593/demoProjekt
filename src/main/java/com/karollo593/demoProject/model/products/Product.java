package com.karollo593.demoProject.model.products;

import java.time.LocalDate;

public class Product extends AbstractProduct {
    private String name;
    private String url;
    private String description;
    private ProductStatus status;

    public Product(long id, int category_id, LocalDate expiryDate, double price, Double total_price, int quantityStock, float weight, String name, String url, String description, ProductStatus status) {
        super(id, category_id, expiryDate, price, total_price, quantityStock, weight);
        this.name = name;
        this.url = url;
        this.description = description;
        this.status = status;
    }

    protected Product() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}

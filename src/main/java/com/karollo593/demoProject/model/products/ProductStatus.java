package com.karollo593.demoProject.model.products;

public enum ProductStatus {
    CONSTANT("Constant"), SPECIAL("Special"), TEMPORARY("Temporary");

    private String status;

    ProductStatus(String status) {
        this.status = status;
    }
}

package com.karollo593.demoProject.model.products;

public class ProductMapper {

    public static ProductDTO toDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setCategory_id(product.getCategory_id());
        dto.setId(product.getId());
        dto.setDescription(product.getDescription());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setQuantityStock(product.getQuantityStock());
        dto.setStatus(product.getStatus());
        dto.setTotal_price(product.getTotal_price());
        dto.setUrl(product.getUrl());
        dto.setWeight(product.getWeight());

        return dto;

    }

    public static Product toEntity(ProductDTO dto) {
        Product entity = new Product();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setStatus(dto.getStatus());
        entity.setUrl(dto.getUrl());
        entity.setCategory_id(dto.getCategory_id());
        entity.setExpiryDate(dto.getExpiryDate());
        entity.setId(dto.getId());
        entity.setPrice(dto.getPrice());
        entity.setQuantityStock(dto.getQuantityStock());
        entity.setTotal_price(dto.getTotal_price());
        entity.setWeight(dto.getWeight());

        return entity;
    }
}

package com.oumaima.microproduct.service;

import com.oumaima.microproduct.entity.Product;
import com.oumaima.microproduct.enumeration.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getProductById(int id);

    void addProduct(Product product);

    List<Product> getProductByCategory(ProductCategory category);

    Page<Product> getFilteredProducts(
            List<ProductCategory> categories,
            Double minPrice,
            Double maxPrice,
            String search,
            Pageable pageable);

    void UpdateProduct(Product product);

    void deleteProduct(int id);

    List<ProductCategory> getCategories();

    // for home screen
    List<Product> getTop4Product();
    long productCount();
}

package com.denis2code.ecommerece.dao;

import com.denis2code.ecommerece.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


//name of json and the path for the web
@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Long> {
}

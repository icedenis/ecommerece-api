package com.denis2code.ecommerece.dao;

import com.denis2code.ecommerece.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin ("http://localhost:4200/")
public interface ProductRepo  extends JpaRepository<Product,Long> {
}

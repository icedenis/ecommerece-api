package com.denis2code.ecommerece.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) //FK in the table
    private  ProductCategory category;

    @Column(name = "sku")
    private  String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private  String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private  String imgUrl;

    @Column(name = "active")
    private  boolean active;

    @Column(name = "units_in_stock")
    private  int unitsInStock;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last_updated")
    private  Date lastUpdate;
}

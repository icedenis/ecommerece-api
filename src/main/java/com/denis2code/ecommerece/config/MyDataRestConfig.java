package com.denis2code.ecommerece.config;

import com.denis2code.ecommerece.entity.Product;
import com.denis2code.ecommerece.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] unspportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        //disable the methods
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unspportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unspportedActions));
        //product category disable as well
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unspportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unspportedActions));

    }
}

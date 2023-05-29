package com.coderhouse.FacturacionSegundaEntregaSandroni.service;

import com.coderhouse.FacturacionSegundaEntregaSandroni.model.Product;
import com.coderhouse.FacturacionSegundaEntregaSandroni.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product postProduct (Product product) throws Exception{
        return productRepository.save(product);
    }
    public Product getProduct (int id) throws Exception{
        Optional<Product> producto = productRepository.findById(id);
        if (producto.isEmpty()){
            return null;
        } else {
            return producto.get();
        }
    }
}

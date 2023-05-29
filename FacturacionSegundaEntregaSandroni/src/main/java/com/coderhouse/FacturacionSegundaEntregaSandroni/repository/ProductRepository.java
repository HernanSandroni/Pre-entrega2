package com.coderhouse.FacturacionSegundaEntregaSandroni.repository;

import com.coderhouse.FacturacionSegundaEntregaSandroni.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

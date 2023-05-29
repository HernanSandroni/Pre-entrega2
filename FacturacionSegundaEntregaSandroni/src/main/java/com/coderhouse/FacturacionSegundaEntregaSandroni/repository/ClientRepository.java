package com.coderhouse.FacturacionSegundaEntregaSandroni.repository;

import com.coderhouse.FacturacionSegundaEntregaSandroni.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}

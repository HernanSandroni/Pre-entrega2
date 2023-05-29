package com.coderhouse.FacturacionSegundaEntregaSandroni.controller;
import com.coderhouse.FacturacionSegundaEntregaSandroni.middleware.ResponseHandler;
import com.coderhouse.FacturacionSegundaEntregaSandroni.model.Product;
import com.coderhouse.FacturacionSegundaEntregaSandroni.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path = "api/product")

public class ProductController {

    @Autowired
    private ProductService productService;

    // creo el producto
    @PostMapping
    public ResponseEntity<Object> postProduct (@RequestBody Product product){
        try{
            System.out.println(product);
            Product productSaved = productService.postProduct(product);
            return ResponseHandler.generateResponse(
                    "Product stores successfully",
                    HttpStatus.OK,
                    productSaved
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }

    //Creo un Get para buscar al producto por id
    @GetMapping(path = "{id}")
    public ResponseEntity<Object> getProduct (@PathVariable() int id){
        try{
            System.out.println(id);
            Product productFound = productService.getProduct(id);
            return ResponseHandler.generateResponse(
                    "Product retrieved successfully",
                    HttpStatus.OK,
                    productFound
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }

}

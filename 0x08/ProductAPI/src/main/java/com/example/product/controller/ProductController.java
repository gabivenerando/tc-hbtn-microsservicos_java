package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value="Api REST Product")
@RestController
@RequestMapping("/api-product/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @ApiOperation(value="Envia uma mensagem de boas vindas")
    @GetMapping("/welcome")
    public String welcome(){
       return "BEM VINDO À PRODUCT REST API.";
    }


    @ApiOperation(value="Retorna um lista de produtos")
    @ApiResponse(code = 11, message = "Warning - the process returned more than 1000 products")
    @GetMapping("/allProducts")
    public String allProducts(){
        return productRepository.getAllProducts().toString();
    }

    @ApiOperation(value="Retorna um produto pesquisado")
    @ApiResponse(code = 12, message = "The field id not informed. This information is required")
    @GetMapping("/findProductById/{id}")
    public Product findProductById(Integer id){
        return productRepository.getProductById(id);
    }

    @ApiOperation(value="Adiciona um produto")
    @ApiResponse(code = 10, message = "Required fields not informed")
    @PostMapping("/addProduct")
    public void addProduct(Product product){
       productRepository.addProduct(product);
    }

    @ApiOperation(value="Atualiza um produto")
    @ApiResponse(code = 14, message = "No information has been updated. The new information is the same as recorded in the database")
    @PutMapping("/addProduct")
    public void updateProduct(Product product){
        productRepository.updateProduct(product);
    }

    @ApiOperation(value="Deleta um produto")
    @ApiResponse(code = 13, message = "User not allowed to remove a product from this category")
    @DeleteMapping("/removeProduct")
    public void removeProduct(Product product){
        productRepository.removeProduct(product);
    }
}

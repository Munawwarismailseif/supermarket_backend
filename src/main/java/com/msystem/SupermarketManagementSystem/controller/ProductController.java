package com.msystem.SupermarketManagementSystem.controller;

import com.msystem.SupermarketManagementSystem.dto.ApiResponse;
import com.msystem.SupermarketManagementSystem.dto.ProductDto;
import com.msystem.SupermarketManagementSystem.model.Product;
import com.msystem.SupermarketManagementSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private  ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
@PostMapping("/purchase")
public ApiResponse purchase(@RequestParam(name = "userId") Integer userId, @RequestBody List<ProductDto> productList) {
    return productService.purchaseProducts(userId, productList);
}

    @GetMapping("/list")
    public ApiResponse list() {
        return productService.findAllProducts();
    }

    @PostMapping("/save")
    public ApiResponse save(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/update")
    public ApiResponse update(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse delete(@PathVariable(name = "id") String productId) {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/getBy/{id}")
    public ApiResponse getById(@PathVariable(name = "id") String productId) {
        return productService.getProductById(productId);
    }

}

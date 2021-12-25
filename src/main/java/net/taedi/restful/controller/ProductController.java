package net.taedi.restful.controller;

import lombok.RequiredArgsConstructor;
import net.taedi.restful.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor //생성자 주입
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<?> getProduct(){
//        List<ProductDto> list = productService.getProduct();
        return ResponseEntity.ok("");
    }

}

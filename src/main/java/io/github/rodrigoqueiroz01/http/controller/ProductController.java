package io.github.rodrigoqueiroz01.http.controller;

import io.github.rodrigoqueiroz01.http.dto.request.ProductRequest;
import io.github.rodrigoqueiroz01.http.dto.response.ProductResponse;
import io.github.rodrigoqueiroz01.http.mapper.ProductMapper;
import io.github.rodrigoqueiroz01.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
@Validated
public class ProductController {

    private final ProductService productService;

    @PostMapping
<<<<<<< HEAD
    public ResponseEntity<ProductResponse> save(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok()
                .body(ProductMapper.toResponse(productService.save(ProductMapper.toModel(productRequest))));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> findById(@PathVariable String productId) {
        return ResponseEntity.ok()
                .body(ProductMapper.toResponse(productService.findById(UUID.fromString(productId))));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductResponse>> findAll() {
        return ResponseEntity.ok()
                .body(ProductMapper.toResponseList(productService.findAll()));
=======
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok()
                .body(ProductMapper.toResponse(productService.create(ProductMapper.toModel(productRequest))));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> readById(@PathVariable String productId) {
        return ResponseEntity.ok()
                .body(ProductMapper.toResponse(productService.readById(UUID.fromString(productId))));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductResponse>> readAll() {
        return ResponseEntity.ok()
                .body(ProductMapper.toResponseList(productService.readAll()));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
    }

    @PutMapping("/{productId}")
    public ResponseEntity<ProductResponse> update(@PathVariable String productId, @RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok()
                .body(ProductMapper.toResponse(productService.update(ProductMapper.toModel(productRequest), UUID.fromString(productId))));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<UUID> delete(@PathVariable String productId) {
        return ResponseEntity.ok()
                .body(productService.delete(UUID.fromString(productId)));
    }

}

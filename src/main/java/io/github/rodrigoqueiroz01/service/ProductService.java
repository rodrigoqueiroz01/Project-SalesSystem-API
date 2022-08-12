package io.github.rodrigoqueiroz01.service;

import io.github.rodrigoqueiroz01.model.ProductModel;
import io.github.rodrigoqueiroz01.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.persistence.NoResultException;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductService {

<<<<<<< HEAD
    public static final String MSG_INVALIDATION = "Produto inválido.";

    private final ProductRepository productRepository;

    public ProductModel save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public ProductModel findById(UUID id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new NoResultException(MSG_INVALIDATION));
    }

    public List<ProductModel> findAll() {
=======
    private final ProductRepository productRepository;

    public ProductModel create(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public ProductModel readById(UUID id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new NoResultException("Produto inválido."));
    }

    public List<ProductModel> readAll() {
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        return productRepository.findAll();
    }

    public ProductModel update(ProductModel productModel, UUID id) {
        productRepository.findById(id)
<<<<<<< HEAD
                .orElseThrow(() -> new NoResultException(MSG_INVALIDATION));
=======
                .orElseThrow(() -> new NoResultException("Produto inválido."));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        productModel.setId(id);
        return productModel;
    }

    public UUID delete(UUID id) {
        var productModel = productRepository.findById(id)
<<<<<<< HEAD
                .orElseThrow(() -> new NoResultException(MSG_INVALIDATION));
=======
                .orElseThrow(() -> new NoResultException("Produto inválido."));
>>>>>>> b87d67aab239ed7283b7f493da970ce236ebdbd7
        productRepository.delete(productModel);
        return id;
    }

}

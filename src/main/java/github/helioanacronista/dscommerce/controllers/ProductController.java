package github.helioanacronista.dscommerce.controllers;

import github.helioanacronista.dscommerce.dto.ProductDTO;
import github.helioanacronista.dscommerce.entities.Product;
import github.helioanacronista.dscommerce.repository.ProductRepository;
import github.helioanacronista.dscommerce.services.ProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
       return productService.findById(id);
    }

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable) {
        return productService.findAll(pageable);
    }
}

package github.helioanacronista.dscommerce.controllers;

import github.helioanacronista.dscommerce.dto.ProductDTO;
import github.helioanacronista.dscommerce.entities.Product;
import github.helioanacronista.dscommerce.repository.ProductRepository;
import github.helioanacronista.dscommerce.services.ProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}

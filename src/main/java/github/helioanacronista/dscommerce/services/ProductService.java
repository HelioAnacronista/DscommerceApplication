package github.helioanacronista.dscommerce.services;

import github.helioanacronista.dscommerce.dto.ProductDTO;
import github.helioanacronista.dscommerce.entities.Product;
import github.helioanacronista.dscommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ProductDTO findById (Long id) {
       Product product = productRepository.findById(id).get();
       return new ProductDTO(product);
    }
}

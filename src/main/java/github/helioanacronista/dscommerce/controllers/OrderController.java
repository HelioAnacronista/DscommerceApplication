package github.helioanacronista.dscommerce.controllers;

import github.helioanacronista.dscommerce.dto.OrderDTO;
import github.helioanacronista.dscommerce.dto.ProductDTO;
import github.helioanacronista.dscommerce.dto.ProductMinDTO;
import github.helioanacronista.dscommerce.services.OrderService;
import github.helioanacronista.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable Long id) {
        OrderDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }


}

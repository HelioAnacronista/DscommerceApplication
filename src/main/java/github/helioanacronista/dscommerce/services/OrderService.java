package github.helioanacronista.dscommerce.services;

import github.helioanacronista.dscommerce.dto.OrderDTO;
import github.helioanacronista.dscommerce.entities.Order;
import github.helioanacronista.dscommerce.repository.OrderRepository;
import github.helioanacronista.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }

}

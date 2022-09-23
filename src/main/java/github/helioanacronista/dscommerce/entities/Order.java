package github.helioanacronista.dscommerce.entities;

import github.helioanacronista.dscommerce.enums.OrderStatus;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    private OrderStatus status;

    private User client;

}

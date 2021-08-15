package by.ushau.Service.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer technicId;

    @Column(nullable = false)
    private Integer clientId;

    @Column(nullable = false)
    private OrderStatus status;

    @Column(nullable = false)
    private Long lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "lastModifiedBy", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "clientId", nullable = false, updatable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "technicId", nullable = false)
    private Technic technic;

    @OneToMany(mappedBy = "order")
    private Set<OrderWorks> orderWorks;

    @OneToMany(mappedBy = "order")
    private Set<OrderParts> orderParts;

}

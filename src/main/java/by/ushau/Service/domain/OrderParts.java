package by.ushau.Service.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class OrderParts {

    @Id
    private Integer partNumber;

    @Id
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "partNumber")
    private Part part;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
}

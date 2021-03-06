package by.ushau.Service.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Entity
@Data
public class OrderWorks {
    @Id
    private Integer orderId;
    @Id
    private Integer workId;

    @ManyToOne
    @JoinColumn(name = "workId")
    private Work work;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
}

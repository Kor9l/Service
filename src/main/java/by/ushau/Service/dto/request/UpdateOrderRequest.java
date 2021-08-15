package by.ushau.Service.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UpdateOrderRequest extends CreateOrderRequest{
    private Integer id;
}

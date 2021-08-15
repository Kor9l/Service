package by.ushau.Service.dto.request;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;

@Data
public class CreateOrderWorksRequest {
    private Integer orderId;
    private Integer workID;
}

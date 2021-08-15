package by.ushau.Service.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;

@NoArgsConstructor
@Data
public class SearchOrderPartsRequest {
    private Integer orderId;
}

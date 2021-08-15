package by.ushau.Service.dto.request;

import by.ushau.Service.domain.OrderStatus;
import lombok.Data;

@Data
public class CreateOrderRequest {
    private Integer technicId;
    private Integer clientId;
    private OrderStatus orderStatus;
    private Long lastModifiedBy;
}

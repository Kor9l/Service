package by.ushau.Service.dto.response;

import by.ushau.Service.domain.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderResponse {
    private  Integer id;
    private Integer technicId;
    private  Integer clientId;
    private OrderStatus orderStatus;
    private Integer lastModifiedBy;
}

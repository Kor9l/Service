package by.ushau.Service.dto.request;

import lombok.Data;

@Data
public class CreateOrderPartsRequest {
    private Integer partNumber;
    private Integer orderId;
}

package by.ushau.Service.mapper;

import by.ushau.Service.domain.Order;
import by.ushau.Service.dto.request.CreateOrderRequest;
import by.ushau.Service.dto.response.OrderResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDtoToEntityMapper {
    Order orderDtoToEntity(CreateOrderRequest createOrderRequest);
    OrderResponse orderEntityToDto(Order order);
}

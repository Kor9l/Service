package by.ushau.Service.service;

import by.ushau.Service.dto.request.CreateOrderRequest;
import by.ushau.Service.dto.request.SearchOrderRequest;
import by.ushau.Service.dto.request.UpdateOrderRequest;
import by.ushau.Service.dto.response.OrderResponse;
import by.ushau.Service.security.UserPrincipal;

import java.util.List;

public interface OrderService {
    OrderResponse getById(Integer id);

    void deleteById(Integer id);

    void create(UserPrincipal userPrincipal, CreateOrderRequest createOrderRequest);

    List<OrderResponse> search (SearchOrderRequest searchOrderRequest);
    OrderResponse update (UserPrincipal userPrincipal, UpdateOrderRequest updateOrderRequest);


}

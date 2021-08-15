package by.ushau.Service.service.impl;

import by.ushau.Service.domain.Order;
import by.ushau.Service.dto.request.CreateOrderRequest;
import by.ushau.Service.dto.request.SearchOrderRequest;
import by.ushau.Service.dto.request.UpdateOrderRequest;
import by.ushau.Service.dto.response.OrderResponse;
import by.ushau.Service.mapper.OrderDtoToEntityMapper;
import by.ushau.Service.repository.OrderRepository;
import by.ushau.Service.security.UserPrincipal;
import by.ushau.Service.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderDtoToEntityMapper orderDtoToEntityMapper;

    @Override
    public OrderResponse getById(Integer id) {
        Order order = orderRepository.getById(id);
        return orderDtoToEntityMapper.orderEntityToDto(order);
    }

    @Override
    public void deleteById(Integer id) { orderRepository.deleteById(id); }

    @Override
    public void create(UserPrincipal userPrincipal, CreateOrderRequest createOrderRequest) {
        Order order = orderDtoToEntityMapper.orderDtoToEntity(createOrderRequest);
        order.setLastModifiedBy(userPrincipal.getId());


    }

    @Override
    public List<OrderResponse> search(SearchOrderRequest searchOrderRequest) {
        return null;
    }

    @Override
    public OrderResponse update(UserPrincipal userPrincipal, UpdateOrderRequest updateOrderRequest) {
        Order order = orderRepository.findById(updateOrderRequest.getId())
                .orElseThrow(()-> new EntityNotFoundException("Order with id:"+updateOrderRequest.getId()+" not found."));
        order.setClientId(updateOrderRequest.getClientId());
        order.setStatus(updateOrderRequest.getOrderStatus());
        order.setTechnicId(updateOrderRequest.getTechnicId());
        order.setLastModifiedBy(userPrincipal.getId());
        orderRepository.save(order);

        return orderDtoToEntityMapper.orderEntityToDto(order);
    }
}

package by.ushau.Service.service;

import by.ushau.Service.domain.Client;
import by.ushau.Service.dto.request.CreateClientRequest;
import by.ushau.Service.dto.request.SearchClientRequest;
import by.ushau.Service.dto.request.UpdateClientRequest;
import by.ushau.Service.dto.response.ClientResponse;
import by.ushau.Service.security.UserPrincipal;
import org.springframework.data.domain.Page;

public interface ClientService {
    ClientResponse getById(Integer id);

    void deleteById(Integer id);

    void create(CreateClientRequest createClientRequest);

     ClientResponse search(SearchClientRequest searchClientRequest);

    ClientResponse update(UpdateClientRequest updateClientRequest);
}

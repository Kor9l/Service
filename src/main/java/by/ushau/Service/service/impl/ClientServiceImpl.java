package by.ushau.Service.service.impl;

import by.ushau.Service.domain.Client;
import by.ushau.Service.dto.request.CreateClientRequest;
import by.ushau.Service.dto.request.SearchClientRequest;
import by.ushau.Service.dto.request.UpdateClientRequest;
import by.ushau.Service.dto.response.ClientResponse;
import by.ushau.Service.mapper.ClientDtoToEntityMapper;
import by.ushau.Service.repository.ClientRepository;
import by.ushau.Service.security.UserPrincipal;
import by.ushau.Service.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientDtoToEntityMapper clientDtoToEntityMapper;

    @Override
    public ClientResponse getById(Integer id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client with id:" + id + " not found."));
        return clientDtoToEntityMapper.clientEntityToDto(client);
    }

    @Override
    public void deleteById(Integer id) {
        clientRepository.deleteById(id);
    }

    @Override
    public void create(CreateClientRequest createClientRequest) {
        Client newClient = clientDtoToEntityMapper.ClientDtoToEntity(createClientRequest);
        clientRepository.save(newClient);
    }

    @Override
    public  ClientResponse search(SearchClientRequest searchClientRequest) {
        Client client = clientRepository.findByFullNameContaining(searchClientRequest.getFullName());

        return clientDtoToEntityMapper.clientEntityToDto(client);
    }

    @Override
    public ClientResponse update(UpdateClientRequest updateClientRequest) {
        Client client = clientRepository.findById(updateClientRequest.getId())
                .orElseThrow(()-> new EntityNotFoundException("Client with id:"
                +updateClientRequest.getId() + " not found."));
        client.setEmail(updateClientRequest.getEmail());
        client.setFullName(updateClientRequest.getFullName());
        client.setTelNumber(updateClientRequest.getTelNumber());
        clientRepository.save(client);

        return clientDtoToEntityMapper.clientEntityToDto(client);
    }
}

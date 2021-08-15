package by.ushau.Service.mapper;


import by.ushau.Service.domain.Client;
import by.ushau.Service.dto.request.CreateClientRequest;
import by.ushau.Service.dto.response.ClientResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientDtoToEntityMapper {
    Client ClientDtoToEntity(CreateClientRequest createClientRequest);

    ClientResponse clientEntityToDto(Client client);
}

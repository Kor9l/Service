package by.ushau.Service.mapper;

import by.ushau.Service.domain.Technic;
import by.ushau.Service.dto.request.CreateTechnicRequest;
import by.ushau.Service.dto.response.TechnicResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TechnicDtoToEntityMapper {
    Technic technicDtoToEntity(CreateTechnicRequest createTechnicRequest);
    TechnicResponse technicEntityToDto(Technic technic);
}

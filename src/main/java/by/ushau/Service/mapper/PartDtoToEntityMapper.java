package by.ushau.Service.mapper;

import by.ushau.Service.domain.Part;
import by.ushau.Service.dto.request.CreatePartRequest;
import by.ushau.Service.dto.response.PartResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PartDtoToEntityMapper {
    Part partDtoToEntity(CreatePartRequest createPartRequest);
    PartResponse partEntityToDto(Part part);
}

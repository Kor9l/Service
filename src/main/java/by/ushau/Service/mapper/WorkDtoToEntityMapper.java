package by.ushau.Service.mapper;

import by.ushau.Service.domain.Work;
import by.ushau.Service.dto.request.CreateWorkRequest;
import by.ushau.Service.dto.response.WorkResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkDtoToEntityMapper {
    Work workDtoToEntity(CreateWorkRequest createWorkRequest);
    WorkResponse workEntityToDtoResponse(Work work);
}

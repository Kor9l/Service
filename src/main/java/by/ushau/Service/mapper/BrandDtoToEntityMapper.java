package by.ushau.Service.mapper;

import by.ushau.Service.domain.Brand;
import by.ushau.Service.dto.request.CreateBrandRequest;
import by.ushau.Service.dto.response.BrandResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BrandDtoToEntityMapper {
    Brand brandDtoToEntity(CreateBrandRequest createBrandRequest);
    BrandResponse brandEntityToDto(Brand brand);
}

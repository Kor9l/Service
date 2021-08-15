package by.ushau.Service.service.impl;

import by.ushau.Service.domain.Brand;
import by.ushau.Service.dto.request.CreateBrandRequest;
import by.ushau.Service.dto.request.SearchBrandRequest;
import by.ushau.Service.dto.response.BrandResponse;
import by.ushau.Service.mapper.BrandDtoToEntityMapper;
import by.ushau.Service.repository.BrandRepository;
import by.ushau.Service.security.UserPrincipal;
import by.ushau.Service.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final BrandDtoToEntityMapper brandDtoToEntityMapper;

    @Override
    public BrandResponse getById(Integer id) {
        Brand brand = brandRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Brand with id " + id + " not found."));
        return brandDtoToEntityMapper.brandEntityToDto(brand);
    }

    @Override
    public void deleteById(Integer id) { brandRepository.deleteById(id);}

    @Override
    public BrandResponse search(SearchBrandRequest searchBrandRequest) {
        Brand brand = brandRepository.findByNameContaining(searchBrandRequest.getName());
        return brandDtoToEntityMapper.brandEntityToDto(brand);
    }

    @Override
    public void create( CreateBrandRequest createBrandRequest) {
        Brand newBrand = brandDtoToEntityMapper.brandDtoToEntity(createBrandRequest);
        brandRepository.save(newBrand);

    }
}

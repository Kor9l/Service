package by.ushau.Service.service;

import by.ushau.Service.domain.Brand;
import by.ushau.Service.dto.request.CreateBrandRequest;
import by.ushau.Service.dto.request.SearchBrandRequest;
import by.ushau.Service.dto.response.BrandResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import by.ushau.Service.security.UserPrincipal;

import java.util.List;

public interface BrandService {
    BrandResponse getById(Integer id);

    void deleteById(Integer id);

    BrandResponse search(SearchBrandRequest searchBrandRequest);

    void create (CreateBrandRequest createBrandRequest);
}

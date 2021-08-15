package by.ushau.Service.service;

import by.ushau.Service.dto.request.CreatePartRequest;
import by.ushau.Service.dto.request.SearchBrandRequest;
import by.ushau.Service.dto.request.SearchPartRequest;
import by.ushau.Service.dto.response.BrandResponse;
import by.ushau.Service.dto.response.PartResponse;
import by.ushau.Service.security.UserPrincipal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PartService {
    PartResponse getById(Integer id);

    void deleteById(Integer id);

    PartResponse search(SearchPartRequest searchPartRequest);

    void create(CreatePartRequest createPartRequest);
}

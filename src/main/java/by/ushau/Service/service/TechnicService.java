package by.ushau.Service.service;

import by.ushau.Service.dto.request.CreateTechnicRequest;
import by.ushau.Service.dto.request.SearchTechnicRequest;
import by.ushau.Service.dto.response.TechnicResponse;
import by.ushau.Service.security.UserPrincipal;
import org.springframework.data.domain.Page;

public interface TechnicService {

    TechnicResponse getById(Integer id);

    void deleteById(Integer id);

    TechnicResponse search(SearchTechnicRequest searchTechnicRequest);

    void create(CreateTechnicRequest createTechnicRequest);

}

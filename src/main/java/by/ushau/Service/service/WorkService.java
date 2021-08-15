package by.ushau.Service.service;

import by.ushau.Service.dto.request.CreateWorkRequest;
import by.ushau.Service.dto.request.SearchWorkRequest;
import by.ushau.Service.dto.response.WorkResponse;
import by.ushau.Service.security.UserPrincipal;
import org.springframework.data.domain.Page;

import java.util.List;

public interface WorkService {

    WorkResponse getById(Integer id);

    void deleteById(Integer id);

    List<WorkResponse> search(SearchWorkRequest searchWorkRequest);

    void create(CreateWorkRequest createWorkRequest);

}

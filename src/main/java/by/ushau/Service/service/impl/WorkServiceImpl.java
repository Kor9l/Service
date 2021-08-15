package by.ushau.Service.service.impl;

import by.ushau.Service.domain.Work;
import by.ushau.Service.dto.request.CreateWorkRequest;
import by.ushau.Service.dto.request.SearchWorkRequest;
import by.ushau.Service.dto.response.WorkResponse;
import by.ushau.Service.mapper.WorkDtoToEntityMapper;
import by.ushau.Service.repository.WorkRepository;
import by.ushau.Service.security.UserPrincipal;
import by.ushau.Service.service.WorkService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class WorkServiceImpl implements WorkService {

    private final WorkRepository workRepository;
    private final WorkDtoToEntityMapper workDtoToEntityMapper;

    @Override
    public WorkResponse getById(Integer id) {
        Work work = workRepository.getById(id);

        return workDtoToEntityMapper.workEntityToDtoResponse(work);
    }

    @Override
    public void deleteById(Integer id) {workRepository.deleteById(id); }

    @Override
    public  List<WorkResponse> search(SearchWorkRequest searchWorkRequest) {
        List<WorkResponse> result = new ArrayList<>();
        result = workRepository.findAll().stream()
                .map(workDtoToEntityMapper::workEntityToDtoResponse)
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public void create(CreateWorkRequest createWorkRequest) {
        Work newWork = workDtoToEntityMapper.workDtoToEntity(createWorkRequest);
        workRepository.save(newWork);
    }
}

package by.ushau.Service.service.impl;

import by.ushau.Service.domain.Part;
import by.ushau.Service.dto.request.CreatePartRequest;
import by.ushau.Service.dto.request.SearchPartRequest;
import by.ushau.Service.dto.response.PartResponse;
import by.ushau.Service.mapper.PartDtoToEntityMapper;
import by.ushau.Service.repository.PartRepository;
import by.ushau.Service.security.UserPrincipal;
import by.ushau.Service.service.PartService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.persistence.SecondaryTable;

@Service
@AllArgsConstructor
public class PartServiceImpl implements PartService {

    private final PartRepository partRepository;
    private final PartDtoToEntityMapper partDtoToEntityMapper;


    @Override
    public PartResponse getById(Integer id) {
        Part part = partRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Part with id:" +id + " not found."));
        return partDtoToEntityMapper.partEntityToDto(part);
    }

    @Override
    public void deleteById(Integer id) {partRepository.deleteById(id); }

    @Override
    public PartResponse search(SearchPartRequest searchPartRequest) {
        Part part = partRepository.findByTitleContaining(searchPartRequest.getTitle());
        return partDtoToEntityMapper.partEntityToDto(part);
    }

    @Override
    public void create(CreatePartRequest createPartRequest) {
        Part newPart = partDtoToEntityMapper.partDtoToEntity(createPartRequest);
        partRepository.save(newPart);

    }
}

package by.ushau.Service.service.impl;

import by.ushau.Service.domain.Technic;
import by.ushau.Service.dto.request.CreateTechnicRequest;
import by.ushau.Service.dto.request.SearchTechnicRequest;
import by.ushau.Service.dto.response.TechnicResponse;
import by.ushau.Service.mapper.TechnicDtoToEntityMapper;
import by.ushau.Service.repository.TechnicRepository;
import by.ushau.Service.security.UserPrincipal;
import by.ushau.Service.service.TechnicService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
public class TechnicServiceImpl implements TechnicService {

    private final TechnicRepository technicRepository;
    private final TechnicDtoToEntityMapper technicDtoToEntityMapper;

    @Override
    public TechnicResponse getById(Integer id) {
        Technic technic = technicRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Technic with id:" +id+" not found."));
        return technicDtoToEntityMapper.technicEntityToDto(technic);
    }

    @Override
    public void deleteById(Integer id) {technicRepository.deleteById(id); }

    @Override
    public TechnicResponse search(SearchTechnicRequest searchTechnicRequest) {
        Technic technic = technicRepository.findBtModelContaining(searchTechnicRequest.getModel());
        return technicDtoToEntityMapper.technicEntityToDto(technic);
    }

    @Override
    public void create(CreateTechnicRequest createTechnicRequest) {
        Technic newTechnic = technicDtoToEntityMapper.technicDtoToEntity(createTechnicRequest);
        technicRepository.save(newTechnic);

    }
}

package by.ushau.Service.dto.request;

import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;

@Data
public class CreateClientRequest {

    private String fullName;

    private String email;

    private Integer telNumber;
}

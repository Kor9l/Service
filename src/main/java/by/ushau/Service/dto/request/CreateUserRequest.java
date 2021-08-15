package by.ushau.Service.dto.request;

import by.ushau.Service.domain.Role;
import lombok.Data;

@Data
public class CreateUserRequest {
    private String email;
    private String fullName;
    private String password;
    private Role role;

}

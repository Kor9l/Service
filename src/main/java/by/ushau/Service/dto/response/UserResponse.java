package by.ushau.Service.dto.response;

import by.ushau.Service.domain.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserResponse {
    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private Role role;
}

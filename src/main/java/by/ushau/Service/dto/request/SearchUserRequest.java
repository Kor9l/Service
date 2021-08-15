package by.ushau.Service.dto.request;

import by.ushau.Service.domain.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SearchUserRequest {
    private String email;
    private Role role;
}

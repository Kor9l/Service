package by.ushau.Service.security;


import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;

import by.ushau.Service.domain.Role;
import by.ushau.Service.domain.User;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@NoArgsConstructor
public final class UserFactory {

    public static UserDetails create(User user) {
        return new UserPrincipal(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getRole(),
                mapToGrantedAuthorities(user.getRole())
        ) {

        };
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(Role userRole) {
        List<GrantedAuthority> userRoles = new ArrayList<>();
        userRoles.add(new SimpleGrantedAuthority(userRole.name()));
        return userRoles;
    }
}

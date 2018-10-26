package MusicShop.security.user;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import MusicShop.entities.User;

public class CustomUserFactory {
	public static CustomUser create(User user) {
        Collection<? extends GrantedAuthority> authorities;
        try {
            authorities = AuthorityUtils.commaSeparatedStringToAuthorityList(user.getRole().toString());
        } catch (Exception e) {
            authorities = null;
        }
        return new CustomUser(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getLastPasswordReset(),
                authorities
        );
    }
}

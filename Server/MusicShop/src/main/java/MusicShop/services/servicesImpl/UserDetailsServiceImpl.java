package MusicShop.services.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import MusicShop.entities.User;
import MusicShop.repositories.UserRepository;
import MusicShop.security.user.CustomUserFactory;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = this.userRepository.findByUsername(username);

        if (user.isPresent()) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return CustomUserFactory.create(user.get());
        }
    }
}

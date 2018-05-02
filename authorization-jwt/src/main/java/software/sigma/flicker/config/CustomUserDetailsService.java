package software.sigma.flicker.config;

import software.sigma.flicker.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import software.sigma.flicker.model.User;


/**
 * Service for provide user data for authentication.
 *
 * @author Anton Taranukha
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private static final String USER_ROLE = "USER";


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        return toUserDetails(user);
    }

    private UserDetails toUserDetails(User user) {
        return org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(USER_ROLE).build();
    }
}

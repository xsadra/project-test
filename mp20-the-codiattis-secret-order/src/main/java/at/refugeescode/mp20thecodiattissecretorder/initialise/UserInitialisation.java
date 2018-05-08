package at.refugeescode.mp20thecodiattissecretorder.initialise;

import at.refugeescode.mp20thecodiattissecretorder.persistence.User;
import at.refugeescode.mp20thecodiattissecretorder.persistence.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class UserInitialisation {

    @Bean
    ApplicationRunner initialiseUsers(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        return args -> {
            User user = new User();
            user.setUsername("admin");
            user.setPassword(passwordEncoder.encode("admin"));
            user.setAuthorities(Stream.of("ROLE_ADMIN").collect(Collectors.toSet()));

            userRepository.save(user);
        };
    }


}

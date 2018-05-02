package software.sigma.flicker.messageservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * User entity.
 *
 * @author Anton Taranukha
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate birthDate;
}

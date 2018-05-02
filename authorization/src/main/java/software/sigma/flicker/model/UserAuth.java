package software.sigma.flicker.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * User representation for authentication.
 *
 * @author Anton Taranukha
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class UserAuth {

    private String username;
    private String password;

}

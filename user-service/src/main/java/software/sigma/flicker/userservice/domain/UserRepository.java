package software.sigma.flicker.userservice.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import software.sigma.flicker.userservice.model.User;

/**
 * User repository.
 *
 * @author Anton Taranukha
 */
public interface UserRepository extends MongoRepository<User, String> {

    /**
     * Returns the User entity with the specified username.
     *
     * @param username username
     * @return user data
     */
    User findByUsername(String username);

}

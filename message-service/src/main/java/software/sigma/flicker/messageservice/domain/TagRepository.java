package software.sigma.flicker.messageservice.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import software.sigma.flicker.messageservice.model.Tag;

/**
 * Tag repository.
 *
 * @author Anton Taranukha
 */
public interface TagRepository extends MongoRepository<Tag, String> {

    /**
     * Returns tag with specified name.
     *
     * @param name name
     * @return tag
     */
    Tag findByName(String name);
}

package software.sigma.flicker.service.impl;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import software.sigma.flicker.messageservice.service.TagService;
import software.sigma.flicker.messageservice.service.impl.TagServiceImpl;

/**
 * Configuration class for testing the {@link TagServiceTest}.
 *
 * @author Anton Taranukha
 */
@TestConfiguration
public class TagServiceTestConfiguration {

    @Bean
    public TagService tafService() {
        return new TagServiceImpl();
    }
}

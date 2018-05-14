package software.sigma.flicker.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * The main class to start the application.
 */
@SuppressWarnings({"HideUtilityClassConstructor", "JavadocMethod"})
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class UserResourceApplication  {

    public static void main(String[] args) {
        SpringApplication.run(UserResourceApplication.class, args);
    }

}

package software.sigma.flicker.messageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MessageResourceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MessageResourceApplication.class, args);
    }

}
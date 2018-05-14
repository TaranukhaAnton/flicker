package software.sigma.flicker.messageservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import software.sigma.flicker.messageservice.model.User;

/**
 * Service to access the User micro-service.
 *
 * @author Anton Taranukha
 */
@FeignClient(name = "user-service")
public interface UserFeignService {

    public final String AUTH_TOKEN = "Authorization";

    /**
     * Returns the User with the specified username.
     *
     * @param username username
     * @return user
     */
    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/users")
    User getByUsername(@RequestHeader(AUTH_TOKEN) String authToken, @RequestParam(value = "username") String username);

}

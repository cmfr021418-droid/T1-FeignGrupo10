package pe.edu.cibertec.t1feigngrupo10.client;

import pe.edu.cibertec.t1feigngrupo10.dto.GitHubUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "github-client",
        url = "https://api.github.com")
public interface GitHubClient {
    @GetMapping("/users")
    List<GitHubUserDto> getUsers();
}

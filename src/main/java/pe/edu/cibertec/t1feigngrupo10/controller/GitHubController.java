package pe.edu.cibertec.t1feigngrupo10.controller;

import pe.edu.cibertec.t1feigngrupo10.dto.GitHubUserDto;
import pe.edu.cibertec.t1feigngrupo10.service.GitHubService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class GitHubController {
    private final GitHubService gitHubService;

    public GitHubController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @GetMapping("/github/users")
    public List<GitHubUserDto> listarUsuarios() {
        return gitHubService.obtenerUsuariosFiltrados();
    }
}

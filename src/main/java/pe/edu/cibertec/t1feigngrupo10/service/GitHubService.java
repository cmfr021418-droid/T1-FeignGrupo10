package pe.edu.cibertec.t1feigngrupo10.service;

import pe.edu.cibertec.t1feigngrupo10.client.GitHubClient;
import pe.edu.cibertec.t1feigngrupo10.dto.GitHubUserDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GitHubService {
    private final GitHubClient gitHubClient;
    public GitHubService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public List<GitHubUserDto> obtenerUsuariosFiltrados() {
        return gitHubClient.getUsers()
                .stream()
                .filter(user -> user.getLogin().length() <=5)
                .filter(user -> !user.isSiteAdmin())
                .toList();
    }
}

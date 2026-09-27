package pe.edu.cibertec.t1feigngrupo10.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GitHubUserDto {
    private Long id;
    private String login;
    @JsonProperty("site_admin")
    private boolean siteAdmin;
    @JsonProperty("avatar_url")
    private String avatarUrl;
}

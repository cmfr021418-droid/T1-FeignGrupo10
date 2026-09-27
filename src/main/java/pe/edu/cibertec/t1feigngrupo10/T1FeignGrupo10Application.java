package pe.edu.cibertec.t1feigngrupo10;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo10Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo10Application.class, args);
    }

}

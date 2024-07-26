package projeto.spring.framework.lab_spring_projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabSpringProjetoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LabSpringProjetoApplication.class, args);
    }
}
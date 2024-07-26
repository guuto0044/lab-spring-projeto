package projeto.spring.framework.lab_spring_projeto;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Lab Spring Projeto API")
                        .version("1.0")
                        .description("Documentação da API do Lab Spring Projeto"));
    }
}
package io.maddennis.reactiveapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Mongo Reactive API",
                version = "1.0.0",
                description = "Endpoints"
        ),
        servers= {
                @Server(
                        url="http://localhost:8080"
                )
        }
)
public class SwaggerConfig {
}

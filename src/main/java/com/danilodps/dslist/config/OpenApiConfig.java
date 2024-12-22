package com.danilodps.dslist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Intensivão Java com Spring Boot")
						.version("v1")
						.description("Exemplo de uma lista de coleção de jogos")
						.termsOfService("https://judge.beecrowd.com/pt/login?redirect=%2Fpt")
						.license(
							new License()
								.name("Apache 2.0")
								.url("https://www.youtube.com/watch?v=xWkbCaGh4ys")
								)
						);
	}
	
	// link: http://localhost:8080/swagger-ui/index.html
}
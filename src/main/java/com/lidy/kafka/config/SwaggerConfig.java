package com.lidy.kafka.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {
		Info info = new Info()
			.version("버전")
			.title("제목")
			.description("설명");

		Server server = new Server();
		server.setUrl("https://www.lidy.synology.me"); // https://에 접근 가능하게 설정

		return new OpenAPI()
			.info(info)
			.servers(List.of(server));
	}
}
package br.com.cdc.shared.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

	@Bean
	public Docket api() {
		Predicate<RequestHandler> basePackage = RequestHandlerSelectors.basePackage("br.com.cdc.apicdc");
		Predicate<String> apiUrls = PathSelectors.ant("/api/**");
		return new Docket(DocumentationType.SWAGGER_2).select().apis(basePackage).paths(apiUrls).build();

	}
}
package br.com.cdc.apicdc;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableJpaRepositories(enableDefaultTransactions = false)
@EnableSwagger2
@SpringBootApplication
@ComponentScan("br.com.cdc.apicdc")
public class ApiDaCasaDoCódigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDaCasaDoCódigoApplication.class, args);
	}

}

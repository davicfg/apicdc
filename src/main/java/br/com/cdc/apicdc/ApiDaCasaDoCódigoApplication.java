package br.com.cdc.apicdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan("br.com.cdc.apicdc")
public class ApiDaCasaDoCódigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDaCasaDoCódigoApplication.class, args);
	}

}

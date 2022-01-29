package br.com.dio.padroesprojetogofspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoGofSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoGofSpringApplication.class, args);
	}

}

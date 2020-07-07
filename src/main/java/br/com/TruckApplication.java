package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TruckApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruckApplication.class, args);
	}

}

package com.idat.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfConfigServerClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfConfigServerClienteApplication.class, args);
	}

}

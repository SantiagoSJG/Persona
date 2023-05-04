package com.SegundoProyecto.HolaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.SegundoProyecto.HolaSpring.Controller","com.SegundoProyecto.HolaSpring.Service"})
@EnableJpaRepositories("com.SegundoProyecto.HolaSpring.Repository")
@EntityScan("com.SegundoProyecto.HolaSpring.Model")
public class HolaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}
}

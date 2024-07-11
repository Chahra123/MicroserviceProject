package com.ines.microreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.ines.microreservation.entity")
@EnableJpaRepositories(basePackages = "com.ines.microreservation.repository")
public class MicroReservationApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroReservationApplication.class, args);
	}

}

package com.garrus58.fkit;

import org.springframework.boot.SpringApplication;

public class TestFkitApplication {

	public static void main(String[] args) {
		SpringApplication.from(FkitApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

package com.example.package1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.package2.Package2Class;

@SpringBootApplication
public class Package1Application {

	public static void main(String[] args) {
		Package2Class package2Class = new Package2Class();

		String bar = package2Class.foo();

		System.out.println(bar);

		SpringApplication.run(Package1Application.class, args);
	}

}

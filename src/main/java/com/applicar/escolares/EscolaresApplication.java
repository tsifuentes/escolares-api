package com.applicar.escolares;

import com.applicar.escolares.jpa.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscolaresApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(EscolaresApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		studentRepository.findAll().forEach((student) -> System.out.println("Full Name = " + student.getFullName()));
	}
}

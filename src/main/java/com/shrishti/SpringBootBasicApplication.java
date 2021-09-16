package com.shrishti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shrishti.basic.Employee;
import com.shrishti.course.Student;

@SpringBootApplication
public class SpringBootBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

//	@Autowired
//	ApplicationContext context;
	@Autowired
	Employee employee;
	
	@Autowired
	Student student;
	@Override
	public void run(String... args) throws Exception {
		// Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(employee);
		System.out.println("Backend courses:");
		student.showCourses("b").stream().forEach(System.out::println);
		System.out.println("Frontend courses:");
		student.showCourses("f").stream().forEach(System.out::println);
		System.out.println("WebDeveloper courses:");
		student.showCourses("w").stream().forEach(System.out::println);
		
	}

}

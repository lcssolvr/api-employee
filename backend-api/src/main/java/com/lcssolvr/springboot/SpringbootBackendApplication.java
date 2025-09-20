package com.lcssolvr.springboot;

import com.lcssolvr.springboot.entity.Employee;
import com.lcssolvr.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee1 = Employee.builder()
                .firstName("Lucas")
                .lastName("Oliveira")
                .email("lucas@email.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("Nilza")
                .lastName("Santos")
                .email("nilza@email.com")
                .build();

        Employee employee3 = Employee.builder()
                .firstName("Antonio")
                .lastName("Neto")
                .email("antonio@email.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }
}

package customer.service;

import customer.service.entities.Customer;
import customer.service.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder()
					.name("John Doe")
					.email("jhon.doe@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Med ktite")
					.email("med.ktite@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("imane")
					.email("imane@gmail.com")
					.build());
			customerRepository.findAll().forEach(c ->{
				System.out.println("------------------");
					System.out.println(c.getId()
							+ " " + c.getName()
							+ " " + c.getEmail());
				System.out.println("------------------");
			});
		};
	}
}

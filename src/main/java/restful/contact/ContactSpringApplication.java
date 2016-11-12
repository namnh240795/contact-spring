package restful.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("restful.contact.repository")

public class ContactSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactSpringApplication.class, args);
	}
}

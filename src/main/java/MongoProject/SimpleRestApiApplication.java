package MongoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestApiApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository CustomerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer ("1" , "sam", "tom");
		Customer c2 = new Customer ("2" , "james", "cat");
		Customer c3 = new Customer ("3" , "leg", "dog");
		
		CustomerRepository.save(c1);
		CustomerRepository.save(c2);
		CustomerRepository.save(c3);




	}

}

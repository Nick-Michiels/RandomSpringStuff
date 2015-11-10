package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by nick on 04.11.15.
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

//    @Bean
//    public CommandLineRunner demo(CustomerRepository repository) {
//        return args -> {
//            repository.save(new Customer("Jack", "De Kwak"));
//            repository.save(new Customer("Chloe", "Skoebiedoe"));
//            repository.save(new Customer("Kim", "Berly"));
//            repository.save(new Customer("David", "Kim"));
//            repository.save(new Customer("Michelle", "Zombie"));
//
//            log.info("Customer found with findAll():");
//            log.info("------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
//
//            log.info("");
//
//            Customer customer1L = repository.findOne(1L);
//            log.info("Customer found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(customer1L.toString());
//
//            log.info("");
//
//            log.info("Customer found with findByLastName('Zombie'):");
//            log.info("---------------------------------------------");
//            for (Customer zombie : repository.findByLastName("Zombie")) {
//                log.info(zombie.toString());
//            }
//            log.info("");
//        };
//    }
}

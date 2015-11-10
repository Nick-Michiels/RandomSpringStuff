package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nick on 04.11.15.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}

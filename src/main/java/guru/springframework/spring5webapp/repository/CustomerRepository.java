package guru.springframework.spring5webapp.repository;

import java.util.List;

import guru.springframework.spring5webapp.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}

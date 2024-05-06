package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}

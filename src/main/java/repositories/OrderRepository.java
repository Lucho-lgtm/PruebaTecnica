package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}

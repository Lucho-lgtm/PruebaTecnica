package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}

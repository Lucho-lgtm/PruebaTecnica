package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}

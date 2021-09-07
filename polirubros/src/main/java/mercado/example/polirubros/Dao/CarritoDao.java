package mercado.example.polirubros.Dao;

import mercado.example.polirubros.modelo.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoDao extends JpaRepository<Carrito, Long> {
}
package mercado.example.polirubros.Dao;

import mercado.example.polirubros.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
}
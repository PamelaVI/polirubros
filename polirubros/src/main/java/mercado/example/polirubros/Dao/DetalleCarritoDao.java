package mercado.example.polirubros.Dao;

import mercado.example.polirubros.modelo.DetalleCarrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleCarritoDao extends JpaRepository<DetalleCarrito, Long> {
}
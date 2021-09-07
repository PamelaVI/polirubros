package mercado.example.polirubros.Dao;

import mercado.example.polirubros.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
}
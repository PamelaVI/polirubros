package mercado.example.polirubros.service;

import mercado.example.polirubros.modelo.Usuario;

import java.util.List;

public interface UsuarioService  {

    public List<Usuario> getAll();

    public Usuario getById(Long idUsuario);

    public Usuario save(Usuario usuario);

    public Usuario update(Usuario usuario);

    public Usuario checkCredentials(String userName, String password);
}
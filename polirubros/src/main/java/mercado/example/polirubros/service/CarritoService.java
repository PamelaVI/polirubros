package mercado.example.polirubros.service;

import mercado.example.polirubros.modelo.Carrito;

import java.util.List;

public interface CarritoService {

    public List<Carrito> getAll();

    public Carrito getById(Long idCarrito);

    public Carrito save(Carrito carrito);
}
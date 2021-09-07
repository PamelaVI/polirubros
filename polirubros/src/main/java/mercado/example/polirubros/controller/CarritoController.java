package mercado.example.polirubros.controller;

import mercado.example.polirubros.modelo.Carrito;
import mercado.example.polirubros.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public ResponseEntity<List<Carrito>> getAll() {
        return new ResponseEntity<List<Carrito>>(this.carritoService.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrito> getById(@PathVariable("id") Long idCarrito) {
        return new ResponseEntity<Carrito>(this.carritoService.getById(idCarrito), HttpStatus.ACCEPTED);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Carrito> save(@RequestBody Carrito carrito) {
        return new ResponseEntity<Carrito>(this.carritoService.save(carrito), HttpStatus.CREATED);
    }
}
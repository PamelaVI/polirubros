package mercado.example.polirubros.controller;

import mercado.example.polirubros.modelo.Usuario;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private final mercado.example.polirubros.service.UsuarioService UsuarioService;
    private UsuarioController usuarioService;

    public UsuarioController(mercado.example.polirubros.service.UsuarioService usuarioService) {
        UsuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll() {
        return new ResponseEntity<List<Usuario>>(this.UsuarioService.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable("id") Long idUsuario) {
        return new ResponseEntity<Usuario>((MultiValueMap<String, String>) this.usuarioService.getById(idUsuario), HttpStatus.ACCEPTED);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario) {
        return new ResponseEntity<Usuario>((MultiValueMap<String, String>) this.usuarioService.save(usuario), HttpStatus.CREATED);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario) {
        return new ResponseEntity<Usuario>((MultiValueMap<String, String>) this.usuarioService.update(usuario), HttpStatus.ACCEPTED);
    }




}
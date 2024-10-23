package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Grados;
import com.example.Proyecto.Servicio.GradoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/grados")
public class GradoControlador {

    private final GradoServicio gradoServicio;

    public GradoControlador(GradoServicio gradoServicio) {
        this.gradoServicio = gradoServicio;
    }

    // Guardar o actualizar Grado
    @PostMapping("/Guardar")
    public Grados guardar(@RequestBody Grados grado) {
        return gradoServicio.guardar(grado);
    }

    // Buscar Grado por ID
    @GetMapping("/{id}")
    public Optional<Grados> obtenerPorId(@PathVariable Long id) {
        return gradoServicio.obtenerTodo(id);
    }

    // Eliminar Grado por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        gradoServicio.eliminar(id);
    }
}

package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Materias;
import com.example.Proyecto.Servicio.MateriaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/materias")
public class MateriaControlador {

    private final MateriaServicio materiaServicio;

    public MateriaControlador(MateriaServicio materiaServicio) {
        this.materiaServicio = materiaServicio;
    }

    // Guardar o actualizar Materia
    @PostMapping("/Guardar")
    public Materias guardar(@RequestBody Materias materia) {
        return materiaServicio.guardar(materia);
    }

    // Buscar Materia por ID
    @GetMapping("/{id}")
    public Optional<Materias> obtenerPorId(@PathVariable Long id) {
        return materiaServicio.obtenerTodo(id);
    }

    // Eliminar Materia por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        materiaServicio.eliminar(id);
    }
}

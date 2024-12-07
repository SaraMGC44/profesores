package com.example.control_profesores.Profesor.controller;

import com.example.control_profesores.Profesor.model.Profesor;
import com.example.control_profesores.Profesor.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Profesor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class profesorController {

    @Autowired
    private final ProfesorService profesorService;

    public profesorController(ProfesorService profesorService) {
        super();
        this.profesorService = profesorService;
    }

    @GetMapping("/listar")
    public List<Profesor> listarProfesores() {
        return profesorService.listarProfesores();
    }
    @PostMapping("/guardar")
    public Profesor guardarProfesor(@RequestBody Profesor profesor){
        return profesorService.guardarProfesor(profesor);
    }

    @GetMapping("/prueba")
    public String Hola(){
        return "hola";
    }
}

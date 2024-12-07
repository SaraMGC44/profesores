package com.example.control_profesores.registroEntradas.controller;

import com.example.control_profesores.registroEntradas.model.RegistroEntrada;
import com.example.control_profesores.registroEntradas.service.RegistroEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registroEntradas")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class RegistroEntradaController {
    @Autowired
    private final RegistroEntradaService registroEntradaService;

    public RegistroEntradaController(RegistroEntradaService registroEntradaService){
        super();
        this.registroEntradaService = registroEntradaService;
    }

    @GetMapping("/lista")
    public List<RegistroEntrada> listarRegistros(){
        return registroEntradaService.listarRegistros();

    }
    @PostMapping("/guardar")
    public RegistroEntrada registrarEntrada(@RequestBody RegistroEntrada registroEntrada){
        return registroEntradaService.registroEntrada(registroEntrada);
    }
}

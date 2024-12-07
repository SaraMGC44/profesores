package com.example.control_profesores.registroEntradas.service;

import com.example.control_profesores.registroEntradas.model.RegistroEntrada;
import com.example.control_profesores.registroEntradas.repository.RegistroEntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegistroEntradaService {
    @Autowired
    private RegistroEntradaRepository registroEntradaRepository;

    public List<RegistroEntrada> listarRegistros(){
        return registroEntradaRepository.findAll();
    }

    public RegistroEntrada registroEntrada(RegistroEntrada registroEntrada){
        registroEntrada.setHorallegada(LocalDateTime.now());
        return registroEntradaRepository.save(registroEntrada);
    }
}

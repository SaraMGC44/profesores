package com.example.control_profesores.Profesor.service;

import com.example.control_profesores.Profesor.model.Profesor;
import com.example.control_profesores.Profesor.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    private ProfesorRepository profesorRepository;
    public ProfesorService(ProfesorRepository profesorRepository){
        super();
        this.profesorRepository =profesorRepository;
    }
    public List<Profesor>listarProfesores(){
        return profesorRepository.findAll();

    }
    public Profesor guardarProfesor(Profesor profesor){
        return profesorRepository.save(profesor);
    }


}

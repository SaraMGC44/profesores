package com.example.control_profesores.Profesor.repository;

import com.example.control_profesores.Profesor.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProfesorRepository extends MongoRepository<Profesor, String> {
    Optional<Profesor> findByNombre(String nombre);
}

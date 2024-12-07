package com.example.control_profesores.registroEntradas.repository;

import com.example.control_profesores.registroEntradas.model.RegistroEntrada;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistroEntradaRepository  extends MongoRepository<RegistroEntrada, String> {

}

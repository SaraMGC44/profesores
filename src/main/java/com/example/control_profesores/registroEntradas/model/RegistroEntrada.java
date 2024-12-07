package com.example.control_profesores.registroEntradas.model;

import java.time.LocalDateTime;

public class RegistroEntrada {
    private String id;
    private String profesorId;
    private LocalDateTime horallegada;

    public String getId(){
        return id;
    }
    public  void setId(String id){
        this.id = id;
    }
    public  String getProfesorId(){
        return profesorId;
    }
    public void setProfesorId(String profesorId){
        this.profesorId = profesorId;
    }

    public LocalDateTime getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(LocalDateTime horallegada) {
        this.horallegada = horallegada;
    }
}

package com.argentinaprograma.Modelos;

import lombok.Data;


@Data
public class Alumno {
    private String nombre;
    private String apellido;
    private EstadoAlumno estado;

    int getFaltas() {
        return 15;
    }
}

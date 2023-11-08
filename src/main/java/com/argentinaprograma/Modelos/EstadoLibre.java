/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.Modelos;

/**
 *
 * @author Usuario
 */
public class EstadoLibre implements EstadoAlumno{

    @Override
    public void cambiarEstado(Alumno alumno) {
        if(alumno.getEstado().getClass().isAssignableFrom(EstadoIncripto.class)){
            if(alumno.getFaltas()>10){
                alumno.setEstado(new EstadoLibre());
            }
        }
    }
    
}

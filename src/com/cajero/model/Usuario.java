package com.cajero.model;

public class Usuario {
    private String nombre;
    private String dni;
    
    public Usuario(String nombre, String dni) {
        if (dni == null || !dni.matches("\\d{8}")) {
            throw new IllegalArgumentException("DNI peruano debe tener 8 digitos");
        }
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}
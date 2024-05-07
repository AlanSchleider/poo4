package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
    private String nombre;
    private String color;

    // Constructor
    public FiguraGeometrica(String nombre, String color, double base, double altura) {
        this.nombre = nombre;
        this.color = color;
    }

    public FiguraGeometrica(String nombre, String color, double radio) {
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos abstractos
    public double obtenerArea() {
        return 0;
    }

    public double obtenerPerimetro() {
        return 0;
    }
}
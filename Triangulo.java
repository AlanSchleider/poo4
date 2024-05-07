package com.mycompany.figurasgeometricaspoo;

public class Triangulo {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(String nombre, String color, double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    // Getter y setter para base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // Getter y setter para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementación de métodos abstractos

    public double obtenerArea() {
        return (base * altura) / 2;
    }

    public double obtenerPerimetro() {
        // No se especifica el cálculo del perímetro para un triángulo genérico,
        // ya que podría ser equilátero, isósceles o escaleno.
        return 0;
    }
}

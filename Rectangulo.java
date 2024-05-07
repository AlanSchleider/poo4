package com.mycompany.figurasgeometricaspoo;

public class Rectangulo {
    private double lado1;
    private double lado2;

    // Constructor
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getter y setter para lado1
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    // Getter y setter para lado2
    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    // Implementación de métodos abstractos

    public double obtenerArea() {
        return lado1 * lado2;
    }


    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}

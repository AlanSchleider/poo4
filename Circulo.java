package com.mycompany.figurasgeometricaspoo;

public class Circulo {
    private double radio;

    // Constructor
    public Circulo(String nombre, String color, double radio) {
        super();
        this.radio = radio;
    }

    // Getter y setter para radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación de métodos abstractos

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }


    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}

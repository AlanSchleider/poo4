package com.mycompany.figurasgeometricaspoo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar nombre de la figura
        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();

        // Paso 2: Solicitar color de la figura
        System.out.println("Ingrese el color de la figura:");
        String color = scanner.nextLine();

        // Paso 3: Solicitar tipo de figura
        System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = scanner.nextInt();

        // Variables para almacenar los datos necesarios de cada figura
        double radio, lado1, lado2, base, altura;

        // Crear la figura correspondiente según el tipo seleccionado
        FiguraGeometrica figura = null;

        switch (tipoFigura) {
            case 1: // Circulo
                System.out.println("Ingrese el radio del círculo:");
                radio = scanner.nextDouble();
                figura = new FiguraGeometrica(nombre, color, radio);
                break;
            case 2: // Rectangulo
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                lado1 = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                lado2 = scanner.nextDouble();
                figura = new FiguraGeometrica(nombre, color, lado1, lado2);
                break;
            case 3: // Triangulo
                System.out.println("Ingrese el valor de la base del triángulo:");
                base = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                altura = scanner.nextDouble();
                figura = new FiguraGeometrica(nombre, color, base, altura);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("Área de la figura: " + figura.obtenerArea());
        System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());

        scanner.close();
    }
}

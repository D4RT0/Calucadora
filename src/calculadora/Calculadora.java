/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Darto
 */

public class Calculadora { // clase encargada de calcular el area y perimetro de las figuras

    private final String calculadora = "casio";

    public static double perimetro(int lado, int radio, int opcion) {
        double area = 0;
        if (opcion == 1) {
            double pi = 3.14;
            area = 2 * pi * radio;
        }
        if (opcion == 2) {
            area = lado * 4;
        }
        if (opcion == 3) {
            area = lado * 3;
        }
        if (opcion == 4) {
            area = (lado * 2) + (radio * 2);
        }
        return area;
    }

    public static double area(int lado, int radio, int opcion) {
        double area = 0;
        if (opcion == 1) {
            double pi = 3.14;
            area = pi * (radio * radio);
        }
        if (opcion == 2) {
            area = lado * lado;
        }
        if (opcion == 3) {
            area = (radio * lado) / 2;
        }
        if (opcion == 4) {
            area = lado * radio;
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Calculadora calc = new Calculadora();
        int opcion = 3;
        double resultado = 0;
        while (opcion != 0) {
            System.out.println("");
            System.out.println("***" + calc.calculadora + "***");
            System.out.println("Ingrese, segun corresponda:");
            System.out.println("1.-Calcular Perimetro");
            System.out.println("2.-Calcular Area");
            System.out.println("0.-Salir");

            opcion = lector.nextInt();

            if (opcion == 1) {
              
                System.out.println("1.-Perimetro Circulo");
                System.out.println("2.-Perimetro Cuadrado");
                System.out.println("3.-Perimetro Triangulo Equilatero");
                System.out.println("4.-Perimetro Rectangulo");

                opcion = lector.nextInt();
                if (opcion == 1) {
                    System.out.println("Ingrese el radio del circulo");
                    int radio = lector.nextInt();
                    resultado = perimetro(0, radio, opcion);
                    System.out.println("El perimetro es" + resultado);
                }
                if (opcion == 2) {
                    System.out.println("Ingrese el lado del cuadrado");
                    int lado = lector.nextInt();
                    resultado = perimetro(lado, 0, opcion);
                    System.out.println("El perimetro es" + resultado);

                }
                if (opcion == 3) {
                    System.out.println("Ingrese el lado del triangulo");
                    int lado = lector.nextInt();
                    resultado = perimetro(lado, 0, opcion);
                    System.out.println("El perimetro es" + resultado);

                }
                if (opcion == 4) {
                    System.out.println("Ingrese el lado del rectangulo");
                    int lado = lector.nextInt();
                    System.out.println("Ingrese la base del rectangulo");
                    int base = lector.nextInt();
                    resultado = perimetro(lado, base, opcion);
                    System.out.println("El perimetro es" + resultado);
                }

            } else if (opcion == 2) {
          
                System.out.println("1.-Area Circulo");
                System.out.println("2.-Area Cuadrado");
                System.out.println("3.-Area Triangulo Equilatero");
                System.out.println("4.-Area Rectangulo");
                opcion = lector.nextInt();
                if (opcion == 1) {
                    System.out.println("Ingrese el radio del circulo");
                    int radio = lector.nextInt();
                    resultado = area(0, radio, opcion);
                    System.out.println("El area es" + resultado);
                }
                if (opcion == 2) {
                    System.out.println("Ingrese el lado del cuadrado");
                    int lado = lector.nextInt();
                    resultado = area(lado, 0, opcion);
                    System.out.println("El area es" + resultado);

                }
                if (opcion == 3) {
                    System.out.println("Ingrese el lado del triangulo");
                    int lado = lector.nextInt();
                    System.out.println("Ingrese la base del triangulo");
                    int base = lector.nextInt();
                    resultado = perimetro(lado, base, opcion);
                    System.out.println("El area es" + resultado);

                }
                if (opcion == 4) {
                    System.out.println("Ingrese el lado del rectangulo");
                    int lado = lector.nextInt();
                    System.out.println("Ingrese la base del rectangulo");
                    int base = lector.nextInt();
                    resultado = perimetro(lado, base, opcion);
                    System.out.println("El area es" + resultado);
                }

            }
        }

    }
}

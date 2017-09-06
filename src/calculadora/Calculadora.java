/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.Scanner;
/**
 *
 * @author Dario, Felipe, Frances
 */

public class Calculadora { // clase encargada de calcular el area y perimetro de las figuras

   
    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
                            
                            
        int opcion = 3;
        while (opcion != 0){
            System.out.println("");
            System.out.println("***Calculadora***");
            System.out.println("Ingrese, segun corresponda:");
            System.out.println("1.-Calcular Perimetro");
            System.out.println("2.-Calcular Area");
            System.out.println("0.-Salir");

            opcion = lector.nextInt();

            switch  (opcion) {
                case 1:
                    System.out.println("1.-Perimetro Circulo");
                    System.out.println("2.-Perimetro Cuadrado");
                    System.out.println("3.-Perimetro Triangulo Equilatero");
                    System.out.println("4.-Perimetro Rectangulo");
                    opcion = lector.nextInt();

                    if (opcion == 1) {
                        System.out.println("Ingrese el radio del circulo");
                        int radio = lector.nextInt();
                        double pi = 3.14;
                        double areaC = 2 * pi * radio;
                        System.out.println("El Perimetro del Circulo es: "+areaC);                        
                    }
                    if (opcion == 2) {
                        System.out.println("Ingrese el lado del cuadrado");
                        int lado=lector.nextInt();
                        double areaC=lado*4;
                        System.out.println("El Perimetro del Cuadrado es: " + areaC);
                    }
                    if (opcion == 3) {
                        System.out.println("Ingrese el lado del Triangulo");
                        int lado = lector.nextInt();
                        double areaT = lado * 3;
                        System.out.println("El Perimetro del Triangulo es: " + areaT);
                        
                    }
                     if (opcion == 4) {
                        System.out.println("Ingrese la base del Rectangulo");
                        int lado = lector.nextInt();
                        System.out.println("Ingrese la altura del Rectangulo");
                        int altura = lector.nextInt();
                        double areaR = (lado*2)+(altura*2);
                        System.out.println("El Perimetro del Rectangulo es: " + areaR);
                        
                    }
                    
                    
                    break;
                case 2:
                    System.out.println("1.-Area Circulo");
                    System.out.println("2.-Area Cuadrado");
                    System.out.println("3.-Area Triangulo");
                    System.out.println("4.-Area Rectangulo");
                    opcion = lector.nextInt();
                    if (opcion == 1) {
                        System.out.println("Ingrese el radio del circulo");
                        int radio = lector.nextInt();
                        double pi = 3.14;
                        double areaC = pi *(radio*radio);
                        System.out.println("El Area del Circulo es: " + areaC);
                    }
                    if (opcion == 2) {
                        System.out.println("Ingrese el lado del cuadrado");
                        int lado = lector.nextInt();
                        double areaC = lado * lado;
                        System.out.println("El Area del Cuadrado es: " + areaC);
                    }
                    if (opcion == 3) {
                        System.out.println("Ingrese la base del Triangulo");
                        int base = lector.nextInt();
                        System.out.println("Ingrese la altura del Triangulo");
                        int altura = lector.nextInt();
                        double areaT = (base*altura)/2;
                        System.out.println("El Area del Triangulo es: " + areaT);
                    }
                     if (opcion == 4) {
                        System.out.println("Ingrese la base del Rectangulo");
                        int lado = lector.nextInt();
                        System.out.println("Ingrese la altura del Rectangulo");
                        int altura = lector.nextInt();
                        double areaR = lado*altura;
                        System.out.println("El Area del Rectangulo es: " + areaR);
                        
                    }
                    break;
                    
                default:
                    break;
                    
                    
                }
        }
      
    }

}


import java.util.Scanner;

/**
 * Ejercicio 10: El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto ( **A** ), tres triángulos rectángulos
 * iguales ( **B** , **C** , **E** ), cuya base mide lo mismo que uno de los
 * lados del cuadrado, y un rectángulo ( **D** ) cuyo ancho mide lo mismo que
 * uno de los lados del cuadrado, mientras que la altura mide lo mismo que la 
 * altura de los triángulos. Se pide que haga un programa que calcule el área 
 * total.

 * @author Jennifer Yunga
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado, altura, areaTotal;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = tcl.nextDouble();
        System.out.print("Ingrese altura de los triangulos:  ");
        altura = tcl.nextDouble();
        areaTotal = (lado  * lado) + (3 * (lado * altura / 2)) + 
                (lado * altura);
        System.out.printf("El area total del poligono es: %.2f%n" , areaTotal);
    }
   
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el lado del cuadrado: 4
Ingrese altura de los triangulos:  2
El area total del poligono es: 36,00
 */

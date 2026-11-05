import java.util.Scanner;
/**
 * Ejercicio 01: Generar un algoritmo que permite calcular y presentar
 * el área de un triángulo. Los datos deben ser pedidos al usuario.
 * @author Jennifer Yunga
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Ingrese base: ");
        base = tcl.nextDouble();  
        System.out.print("Ingrese altura: ");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area es: " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese base: 8
Ingrese altura: 4
Area es: 16.0
*/
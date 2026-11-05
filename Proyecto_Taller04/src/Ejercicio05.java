import java.util.Scanner;
/**
 * Ejercicio 05: Generar un algoritmo que permita calcular y mostrar el costos 
 * de una computadora de escritorio. La misma es comprada por partes; 
 * CPU, teclado, pantalla, ratón.
 * @author Jennifer Yunga
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cpu, teclado, pantalla, raton, total;
        System.out.print("Ingrese el costo del CPU:");
        cpu = tcl.nextDouble();
        System.out.print("Ingrese conto del teclado:");
        teclado = tcl.nextDouble();
        System.out.print("Ingrese costo de la pantalla:");
        pantalla = tcl.nextDouble();
        System.out.print("Ingrese costo del raton: ");
        raton = tcl.nextDouble();
        total = cpu + teclado + pantalla + raton;
        System.out.printf("Costo total de la computadora: $%.2f%n", total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 *run:
Ingrese el costo del CPU:200
Ingrese conto del teclado:20
Ingrese costo de la pantalla:215
Ingrese costo del raton: 15
Costo total de la computadora: $450,00
BUILD SUCCESSFUL (total time: 25 seconds)

 */
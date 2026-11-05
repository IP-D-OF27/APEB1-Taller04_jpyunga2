
import java.util.Scanner;

/**
 * Ejercicio 07: Generar un algoritmo que permita calcular y mostrar el valor a
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%.
 *
 * @author Jennifer Yunga
 * @version 1.0
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double kilovatioH, numeroKl, edad, valorP, total;
        System.out.print("Ingrese costo de por kilovatio/hora: ");
        kilovatioH = tcl.nextDouble();
        System.out.print("Ingrese los kilovatios consumidos en el mes: ");
        numeroKl = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextDouble();
        total = kilovatioH * numeroKl;
        valorP = total;
        if (edad > 65) {
            valorP = total - (total * 0.10);
        }
        System.out.println("El valor de la planilla es: " + valorP);
    }
}
/**
 * * EVIDENCIA DEL RUN: 
 *   run:
Ingrese costo de por kilovatio/hora: 0,30
Ingrese los kilovatios consumidos en el mes: 200
Ingrese su edad: 66
El valor de la planilla es: 54.0
BUILD SUCCESSFUL (total time: 27 seconds)
run:
Ingrese costo de por kilovatio/hora: 0,30
Ingrese los kilovatios consumidos en el mes: 200
Ingrese su edad: 47
El valor de la planilla es: 60.0
BUILD SUCCESSFUL (total time: 13 seconds)
 */

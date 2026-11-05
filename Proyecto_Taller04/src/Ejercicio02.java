
import java.util.Scanner;

/**
 * Ejercicio 02: Generar un algoritmo que permite ingresar los gastos de 
 * tres hijos de un padre de familia; calcular y mostrar el total de gastos 
 * de los hijos del padre de familia.
 * @author Jennifer Yunga
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gastoHijo1, gastoHijo2, gastoHijo3, totaldegastos;
        System.out.println("Ingresar los 3 gastos: ");
        gastoHijo1 = tcl.nextDouble();
        gastoHijo2 = tcl.nextDouble();
        gastoHijo3 = tcl.nextDouble();
        totaldegastos = gastoHijo1 + gastoHijo2 + gastoHijo3;
        System.out.println("Gastos totales: "+ totaldegastos);      
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
run:
Ingresar los 3 gastos: 
29
48
50
Gastos totales: 127.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */
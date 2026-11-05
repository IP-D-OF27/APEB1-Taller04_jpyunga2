
import java.util.Scanner;

/**
 * Ejercicio 04: Generar un algoritmo que permita calcular y mostrar el valor de
 * la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes.
 * @author Jennifer Yunga
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoM, minConsM, planillaTotal;
        System.out.print("Ingrese el costo por minutos: ");
        costoM = tcl.nextDouble();
        System.out.print("Ingrese los minutos consumidos en el mes: ");
        minConsM =tcl.nextDouble();
        planillaTotal = costoM + minConsM;
        System.out.println("Valor total de la planilla: " + planillaTotal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 run:
Ingrese el costo por minutos: 3
Ingrese los minutos consumidos en el mes: 38
Valor total de la planilla: 41.0
BUILD SUCCESSFUL (total time: 17 seconds)

 */
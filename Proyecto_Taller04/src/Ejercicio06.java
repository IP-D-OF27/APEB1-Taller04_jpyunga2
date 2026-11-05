import java.util.Scanner;
/**
 * Ejercicio 06: Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto 
 * del préstamo y el interés mensual a cobrar.
 * @author Jennifer Yunga 
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double monto, interes, interesM,totalPagar, pagoMensual;
        System.out.print("Ingrese el monto del prestamo: $");
        monto = tcl.nextDouble();
        System.out.print("Ingrese el interes mensual:" + "%");
        interes = tcl.nextDouble();
        interesM = monto* interes /100;
        totalPagar = monto + (interesM * 12);
        pagoMensual = totalPagar / 12;
        System.out.println("El pago mensual es: "+ pagoMensual);
        
    }
   
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el monto del prestamo: $1200
Ingrese el interes mensual:%8
El pago mensual es: 196.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */
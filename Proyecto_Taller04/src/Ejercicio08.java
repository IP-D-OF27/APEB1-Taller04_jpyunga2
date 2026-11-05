import java.util.Scanner;
/**
 * Ejercicio 08: Se debe generar una solución que permita calcular y mostrar el
 * valor total a pagar mensual de servicios digitales de una persona.
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 * @author Jennifer Yunga
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix, youtubeP, dropbox, spotify,edad, totalP, totalM;
        System.out.print("Ingrese pago mensual netflix: ");
        netflix = tcl.nextDouble();
        System.out.print("Ingrese pago mensual youtube premium: ");
        youtubeP = tcl.nextDouble();
        System.out.print("Ingrese pago mensual dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.print("Ingrese pago mensual Spotify: ");
        spotify = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextDouble();
        totalM = netflix + youtubeP + dropbox  + spotify;
        totalP = totalM;
        if (edad < 30 ){
            totalP = totalM - (totalM * 0.20);
        }
        System.out.println("El pago mensual total es :" + totalP);
    }
}

/***12
 * EVIDENCIA DEL RUN:
 * run:
Ingrese pago mensual netflix: 12
Ingrese pago mensual youtube premium: 8
Ingrese pago mensual dropbox: 6,50
Ingrese pago mensual Spotify: 6
Ingrese su edad: 23
El pago mensual total es :26.0
BUILD SUCCESSFUL (total time: 37 seconds)
run:
Ingrese pago mensual netflix: 12
Ingrese pago mensual youtube premium: 8
Ingrese pago mensual dropbox: 6,50
Ingrese pago mensual Spotify: 6
Ingrese su edad: 33
El pago mensual total es :32.5
BUILD SUCCESSFUL (total time: 26 seconds)

 */

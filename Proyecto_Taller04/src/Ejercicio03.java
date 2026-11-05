
import java.util.Scanner;

/**
 * Ejercicio 03: Se desea desarrollar un algoritmo que permita mostrar la 
 * tabla de multiplicar de un número ingresado por el usuario; solo en el caso 
 * que el valor del número esté entre 2 y 6. No use aún, ciclos repetitivos.
 * @author Jennifer Yunga
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numElegido;
        System.out.print("Ingrese el numero elegido entre 2 a 6:");
        numElegido = tcl.nextInt();
        if (numElegido >= 2  && numElegido <= 6){
            System.out.println("Tabla multiplicar del " + numElegido);
            System.out.println(numElegido + "*1 = " + (numElegido * 1));
            System.out.println(numElegido + "*2 = " + (numElegido * 2));
            System.out.println(numElegido + "*3 = " + (numElegido * 3));
            System.out.println(numElegido + "*4 = " + (numElegido * 4));
            System.out.println(numElegido + "*5 = " + (numElegido * 5));
            System.out.println(numElegido + "*6 = " + (numElegido * 6));
            System.out.println(numElegido + "*7 = " + (numElegido * 7));
            System.out.println(numElegido + "*8 = " + (numElegido * 8));
            System.out.println(numElegido + "*9 = " + (numElegido * 9));
            System.out.println(numElegido + "*10 = " + (numElegido * 10));
            System.out.println(numElegido + "*11 = " + (numElegido * 11));
            System.out.println(numElegido + "*12 = " + (numElegido * 12));  
        } 
        else{
            System.out.println("El numero debe estar entre 2 a 6");
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 run:
Ingrese el numero elegido entre 2 a 6:
4
Tabla multiplicar del 4
4*1 = 4
4*2 = 8
4*3 = 12
4*4 = 16
4*5 = 20
4*6 = 24
4*7 = 28
4*8 = 32
4*9 = 36
4*10 = 40
4*11 = 44
4*12 = 48
BUILD SUCCESSFUL (total time: 5 seconds)
run:
Ingrese el numero elegido entre 2 a 6:
7
El numero debe estar entre 2 a 6
BUILD SUCCESSFUL (total time: 10 seconds)

 */

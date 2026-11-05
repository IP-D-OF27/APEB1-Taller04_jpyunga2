import java.util.Scanner;
/**
 * Ejercicio 09: Desarrolle una solución que determine el estado académico de
 * una persona estudiante en una asignatura universitaria a partir de una
 * calificación de evaluación continua, una calificación de examen final y un
 * porcentaje de asistencia. La regla institucional establece que: La asistencia
 * mínima debe alcanzarse para ser evaluada. Existe una nota mínima en el examen
 * final, y La nota final se calcula combinando evaluación continua y examen
 * final. La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y
 * mostrar la nota final redondeada a un decimal.
 *
 * @author Jennifer Yunga
 * @version 1.0
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaluacionC, asistencia, examenF, asistenciaM,
                notaMinimaEx, notaFinal, notaRedondeada;
        System.out.print("Ingrese nota de la Evaluacion Continua: ");
        evaluacionC = tcl.nextDouble();
        System.out.print("Ingrese nota del Examen Final: ");
        examenF = tcl.nextDouble();
        System.out.print("Ingrese el Porcentaje de Asistencia: ");
        asistencia = tcl.nextDouble();
        asistenciaM = 75;
        notaMinimaEx = 6.5;
        notaFinal = (evaluacionC * 0.40) + (examenF * 0.60);
        if (asistencia < asistenciaM) {
            System.out.println("Estado academico: Reprobado");
            System.out.println("Motivo: No alcanza la asistencia minima");

        } else if (examenF < notaMinimaEx) {
            System.out.println("Estado academico: Reprobado");
            System.out.println("Motivo: No alcanza la nota minima del examen");
        } else if (notaFinal >= 6.5) {
            System.out.println("Estado academico: Aprobado");

        } else if (notaFinal >= 5.0) {
            System.out.println("Estado academico: Supletorio");

        } else {
            System.out.println("Estado academico: Reprobado");
        }
        System.out.printf("La nota final es: %.1f%n", notaFinal);
    }
}

/**
 * * EVIDENCIA DEL RUN:
 * run:
Ingrese nota de la Evaluacion Continua: 8
Ingrese nota del Examen Final: 7
Ingrese el Porcentaje de Asistencia: 80
Estado academico: Aprobado
La nota final es: 7,4
* Ingrese nota de la Evaluacion Continua: 3
Ingrese nota del Examen Final: 7
Ingrese el Porcentaje de Asistencia: 80
Estado academico: Supletorio
La nota final es: 5,4
* Ingrese nota de la Evaluacion Continua: 8
Ingrese nota del Examen Final: 8
Ingrese el Porcentaje de Asistencia: 70
Estado academico: Reprobado
Motivo: No alcanza la asistencia minima
La nota final es: 8,0
* ngrese nota de la Evaluacion Continua: 10
Ingrese nota del Examen Final: 5
Ingrese el Porcentaje de Asistencia: 83
Estado academico: Reprobado
Motivo: No alcanza la nota minima del examen
La nota final es: 7,0
 */

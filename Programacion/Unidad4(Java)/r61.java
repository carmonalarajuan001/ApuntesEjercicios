import java.util.Scanner;

public class r61 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroAlumno = 1;
        int sumatorio = 0;
        int alumnosAprobados = 0;
        int alumnosSuspensos = 0;

        System.out.println("Introduce la calificación del alumno " + numeroAlumno);
        int nota = scanner.nextInt();

        while (nota != -1){
            sumatorio += nota;
        
            if (nota<5) {
                alumnosSuspensos++;
            } else {
                alumnosAprobados++;
            }
        numeroAlumno++;
        System.out.println("\"Introduce la calificación del alumno \" + numeroAlumno + \" (o -1 para terminar): \"");
        nota =scanner.nextInt();
        }

        int totalAlumnos = alumnosAprobados + alumnosSuspensos;
        double media = 0;
        if (totalAlumnos > 0) {
            media = (double) sumatorio / totalAlumnos; //double ntre parentesis para obligar al programa a poner el numero decimal
        }

        System.out.println("Hay " + alumnosAprobados + " alumnos aprobados y " + alumnosSuspensos + " alumnos suspensos.");
        System.out.println("La calificación media es " + media);

        
        scanner.close();
    }
}
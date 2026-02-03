public class e3 {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Carlos", "Matemáticas", 7);
        Alumno alumno2 = new Alumno("Lucía", "Lengua", 5);

        System.out.println("Alumno: " + alumno1.nombre +
                " Materia: " + alumno1.materia +
                " ¿Aprobó? " + alumno1.aprobo());

        System.out.println("Alumno: " + alumno2.nombre +
                " Materia: " + alumno2.materia +
                " ¿Aprobó? " + alumno2.aprobo());
    }
}

class Alumno {

    String nombre;
    String materia;
    double calificacion;

    Alumno(String nombre, String materia, double calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    boolean aprobo() {
        boolean aprobado;
        //if (this.calificacion >= 6) {
        //    aprobado=true;
        //} else {
        //    aprobado=false;
        //}
        //return aprobado;
        return (calificacion>=6.0);
    }
}
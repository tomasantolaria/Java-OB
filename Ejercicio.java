public class Ejercicio {
    public static void main(String[] args) {

        String[] apellidosAlumnos = {"Fernandez", "Gimenez", "Gutierrez", "Lopez", "Rey"};
        String oracion = "Los apellidos de los alumnos son: ";
        String resultado = null;

        /* Otra forma de hacerlo
        for (String apellidosAlumno : apellidosAlumnos) {
            oracion += apellidosAlumno + ", ";
        }
        System.out.println(oracion);
        */
        for(int i=0; i<apellidosAlumnos.length; i++){
            oracion+= apellidosAlumnos[i] + ", ";
        }
        System.out.println(oracion);

    }
}

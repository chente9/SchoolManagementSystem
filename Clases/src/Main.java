import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

public class Main {
    public static void main (String [] argas) {
        Estudiante estudiante1 = new Estudiante( 01, "Maria ", "Carias", LocalDate.of(2001, 12,19), "Matriculado");
        Estudiante estudiante2 = new Estudiante (02, "Juan ", "Catillo ", LocalDate.of(2012, 8, 11), "No matriculado");
        //Generar isntancias del curso
        Curso curso1 = new Curso (010, "Estudios Sociales". "Profesor1", LocalDate.of(2024, 1, 15));
        Curso curso2 = new Curso (011, "Ciencias Naturales", "Profesor2", LocalDate.of(2024, 2,12));


    }
}

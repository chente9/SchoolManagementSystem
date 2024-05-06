import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

public class Main {
    public static void main (String [] argas) {
        Estudiante estudiante1 = new Estudiante( 01, "Maria ", "Carias", LocalDate.of(2001, 12,19), "Matriculado");
        Estudiante estudiante2 = new Estudiante (02, "Juan ", "Catillo ", LocalDate.of(2012, 8, 11), "No matriculado");
        //Generar isntancias del curso
        Curso curso1 = new Curso (010, "Estudios Sociales", "Profesor1", 5, 12);
        Curso curso2 = new Curso (011, "Ciencias Naturales", "Profesor2", 3, 15);

        GestorAcademico gestor = new GestorAcademico();

        //Agregar estudiante
        gestor.agregarEstudiante(estudiante1);
        gestor.agregarEstudiante(estudiante2);

        //Agregar curso
        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);

        //Probar inscripcion
        gestor.inscribirEstudianteEnCurso(estudiante1, curso1);
        gestor.inscribirEstudianteEnCurso(estudiante2, curso1);
        // deberìa de tirar error
        gestor.inscribirEstudianteEnCurso(estudiante1, curso2);

        //Mostrar estudiantes inscritos
        gestor.mostrarEstudiantesPorCuros(curso1);
        gestor.mostrarEstudiantesPorCuros(curso2);

        //Mostrar descripcion de un estudiante
        try {
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        } catch (EstudianteNoInscritoExcepcion e) {
            System.out.println(e.getMessage());
        }

        //Mostrar estudiates, despues de la desinscripcion
        gestor.mostrarEstudiantesPorCuros(curso1);
    }
}

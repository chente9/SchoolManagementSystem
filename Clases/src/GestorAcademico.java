
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorAcademico {

    //ArrayList para almacenar datos de estudiantes
    public ArrayList<Estudiante> listaEstudiantes;
    //ArrayList para almacenar los datos del curso
    public ArrayList<Curso> listaCursos;
    //HashMap para mantener los listados de estudiantes en cada curso
    private HashMap<Curso, ArrayList<Estudiante>> estudiantesPorCurso;

    //Constructor
    public GestorAcademico() {
        listaEstudiantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
        estudiantesPorCurso = new HashMap<>();
    }

    //Metodo para agregar un estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    //Metodo para agregar curo
    public void agregarCurso(Curso curso) {
        listaCursos.add(curso);
        //Iniciar la lista de estudiantes inscritos en este curso
        estudiantesPorCurso.put(curso, new ArrayList<>());
    }

    //Metodo para inscribir un estudiante en un curso
    public void inscribirEstudianteEnCurso(Estudiante estudiante, Curso curso) {
        if (listaEstudiantes.contains(estudiante) && listaCursos.contains(curso)) {
            //Obtener la lista de estudiantes inscritos en el curso
            ArrayList<Estudiante> estudiantesInscritos = estudiantesPorCurso.get(curso);
            //Agregar al estudiante en la lista
            estudiantesInscritos.add(estudiante);
            //Actualizar el mapa
            estudiantesPorCurso.put(curso, estudiantesInscritos);
            System.out.println(estudiante.getNombre() + "inscrito en el curso " + curso.getNombre());
        } else {
            System.out.println("Estudiante o curso no encontrado. ");
        }
    }

    //Metodo para mostrar la lista de estudiantes inscritos en un curso
    public void mostrarEstudiantesPorCuros (Curso curso) {
        if (listaCursos.contains(curso)) {
            ArrayList<Estudiante> estudiantesInscritos = estudiantesPorCurso.get(curso);
            System.out.println("Estudiantes inscritos en el curso " + curso.getNombre() + ":");
            for (Estudiante estudiante : estudiantesInscritos) {
                System.out.println(estudiante.getNombre() + " " + estudiante.getApellido());
            }
        } else {
            System.out.println("Curso no encontrado. ");
    }

    }


    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoExcepcion {
        ArrayList estudiantesInscritos = estudiantesPorCurso.get(idCurso);
        if (estudiantesInscritos != null && estudiantesInscritos.contains(idEstudiante)) {
            estudiantesInscritos.remove(Integer.valueOf(idEstudiante));
        } else throw new EstudianteNoInscritoExcepcion ("El estudiante no está isncrito en el curso o el ID del curso no es valido");
    }

}

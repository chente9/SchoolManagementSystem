import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ServiciosAcademicosI {
    //Lista para almacenar estudiantes
    private List<Estudiante> listaEstuciantes;
    //Lista para almacenar cursos
    private List<Curso> listaCursos;
    //Mapa para mantener la lista de estudiantes isncritos en cada curso
    private Map<Integer, List<Integer>> estudiantePorCurso;

    //constructor
    public ServiciosAcademicosI () {
        listaEstuciantes = new ArrayList<>();
        listaCursos = new ArrayList<>();
        estudiantePorCurso = new HashMap<>();
        }
    //Metodo para agregar a estudiantes que no están ya matriculados

    private void matricularEstudiante(Estudiante estudiante) {
        if(!listaEstuciantes.contains(estudiante)) {
            listaEstuciantes.add(estudiante);
        }
    }
    //Metodo para añadir curso si no existe

    private void agregarCurso(Curso curso) {
        if(!listaCursos.contains(curso)) {
            listaCursos.add(curso);
            estudiantePorCurso.put(curso.getId(), new ArrayList<>());
        }
    }
    //Metodo para isncribir nuevo estudiante en el curso

    public void inscribirEstudianteEnCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        if (listaEstuciantes.contains(estudiante)) {
            List<Integer> estudiantesInscrito = estudiantePorCurso.get(idCurso);
            if (estudiantesInscrito != null && estudiantesInscrito.contains(estudiante.getId())) {
            throw new EstudianteYaInscritoException("El estudiante ya está inscrito en el curso");
            } else {
                estudiantesInscrito.add(estudiante.getId());
                estudiantePorCurso.put(idCurso, estudiantesInscrito);
            }
        }else {
            System.out.println("El estudiante no está matriculado");
        }
    }

   }

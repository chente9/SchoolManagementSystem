import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    Override
    private void matricularEstudiante(Estudiante estudiante) {
        if(!listaEstuciantes.contains(estudiante)) {
            listaEstuciantes.add(estudiante);
        }
    }
    //Metodo para añadir curso si no existe
    Override
    private void agregarCurso(Curso curso) {
        if(!listaCursos.contains(curso)) {
            listaCursos.add(curso);
            estudiantePorCurso.put(curso.getId(), new ArrayList<>()),
        }
    }
    //Metodo para isncribir nuevo estudiante en el curso
    Override
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

    public void desinscribirEstudianteCurso(int idEstudiante, int idCuro) throws EstudianteNoInscritoExcepcion {
        List <estudiantesInscritos = estudiantePorCurso.get(idCuro);
        if (estudiantesInscritos != null && estudiantesInscritos.contains(idEstudiante)) {
            estudiantesInscritos.remove(Integer.valueOf(idEstudiante));
            estudiantePorCurso.put(idCuro, estudiantesInscritos);
        } else throw new EstudianteNoInscritoExcepcion ("El estudiante no está isncrito en el curso o el ID del curso no es valido");
    }

}

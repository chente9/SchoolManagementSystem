import java.time.LocalDate;

public class Estudiante extends Persona{

        //Atributos
        private String estado;

        //Constructor
    public Estudiante (int id, String nombre, String apellido, LocalDate fecha_nacimiento, String estado) {
    super(id,nombre, apellido,fecha_nacimiento);
        this.estado = estado;
    }
    // Setters and Getters

    public void setEstado () {
        this.estado = estado;
        }


    }


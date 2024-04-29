import java.time.LocalDate;

public class Estudiante {

        //Atributos
        private int id;
        private String nombre;
        private String apellido;
        private LocalDate fecha_nacimiento;
        private String estado;

        //Constructor
    public Estudiante (int id, String nombre, String apellido, LocalDate fecha_nacimiento, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
    }
    // Setters and Getters
    public int getId () {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre () {
        return nombre;
    }
    public void setNombre () {
        this.nombre = nombre;
    }

    public String getApellido () {
        return apellido;
    }
    public void setApellido () {
        this.apellido = apellido;
    }
    public LocalDate getFecha_nacimiento () {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento () {
        this.fecha_nacimiento = getFecha_nacimiento();
    }
    public String getEstado () {
        return estado;
    }
    public void setEstado () {
        this.estado = estado;
    }
    //Metodo toString para representar el objeto como una cadena
    @Override
    public String toString () {
        return "Estudiante " + "Id: " + id + "Nombre: " + nombre + "Apellido: " + apellido + "Frecha de nacimiento: " + fecha_nacimiento + "Estado: " + estado ;

        }
    }


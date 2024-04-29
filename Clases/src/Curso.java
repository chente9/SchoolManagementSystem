public class Curso {
    //Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private int noCreditos;
    private double version;

    //Constructor
    public Curso ( int id, String nombre, String descripcion, int noCreditos, double version){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.noCreditos = noCreditos;
        this.version = version;
    }

    //Getters and Setters
    public int getId () {
        return id;
    }
    public void setId () {
        this.id = id;
    }
    public String getNombre () {
        return nombre;
    }
    public void setNombre () {
        this.nombre = nombre;
    }
    public String getDescripcion () {
        return descripcion;
    }
    public void setDescripcion () {
        this.descripcion = descripcion;
    }
    public int getNoCreditos () {
        return noCreditos;
    }
    public void setNoCreditos () {
        this.noCreditos = noCreditos;
    }
    public double getVersion () {
        return version;
    }
    public void setVersion () {
        this.version = version;
    }
    //Metodo to string para representar el objeto como una cadena
    @Override
    public String toString () {
        return  "Curos " + "Id: " + id + "Nombre: " + nombre + "Descripción: " + descripcion + "Número de creditos: " + noCreditos + "Version: " + version ;

    }
}

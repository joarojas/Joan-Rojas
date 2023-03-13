public class Estudiantes {
    private String nombre;
    private int edad;
    private String carrera;
    private int año;

    //-----------------------------------------------------------------------------

    public Estudiantes(String nombre, int edad, String carrera, int año) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.año = año;
    }
    //-----------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "Nombre='" + nombre + '\'' +"," +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +"," +
                ", año=" + año +
                '}' + 
                "\n"  ;
    }
    //-----------------------------------------------------------------------------
}

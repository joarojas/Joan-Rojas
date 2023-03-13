public class Curso {
    private String nombre;
    private String descripcion;
    private int capacidadMaxima;
    private Estudiantes[] estudiantes;
    private int semestre;
    private int indiceActual = 0;
    //-------------------------------------------------------------
    public Curso(String nombre, String descripcion, int capacidadMaxima, int semestre) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidadMaxima = capacidadMaxima;
        this.semestre = semestre;
        this.estudiantes = new Estudiantes[capacidadMaxima];
    }
    //-------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Estudiantes[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    //--------------------------------------------------------------------------------
    public void agregarPersonas(Estudiantes e){
        if (indiceActual < this.capacidadMaxima) {
            this.estudiantes[indiceActual] = e;
            indiceActual++;
        }
        else
            System.out.println("Limite alcanzado, no hay espacio en el curso actual");
    }
    //--------------------------------------------------------------------------------
    //metodo que obtenga el nombre de los estudiantes en la clase estudiante
    public String getNombresEstudiantes(){
        String nombres = "";
        for (int i = 0; i < indiceActual; i++) {
            nombres += estudiantes[i].getNombre() + ", ";
        }
        return nombres;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "Nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", Nombre de los estudiamntes=" + getNombresEstudiantes() +
                "semestre=" + semestre +
                ", Estudiantes activos=" + indiceActual +
                '}' + 
                "\n"  ;
    }
}

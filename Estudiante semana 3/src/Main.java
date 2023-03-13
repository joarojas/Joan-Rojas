public class Main {

    public void run() {
        Estudiantes[] estudiante;
        estudiante = new Estudiantes[15];

        estudiante[0] = new Estudiantes("Pedro", 18,"Computación",2);
        estudiante[1] = new Estudiantes("María", 24,"Computación",1);
        estudiante[2] = new Estudiantes("Juan", 20,"Computación",3);
        estudiante[3] = new Estudiantes("Ana", 19,"Computación",1);
        estudiante[4] = new Estudiantes("Luis", 21,"Computación",1);
        estudiante[5] = new Estudiantes("Luisa", 22,"Computación",1);
        estudiante[6] = new Estudiantes("Carlos", 23,"Computación",3);
        estudiante[7] = new Estudiantes("Carla", 24,"Computación",3);
        estudiante[8] = new Estudiantes("Jorge", 25,"Computación",2);
        estudiante[9] = new Estudiantes("Jorgina", 26,"Computación",1);

        Curso[] curso;
        curso = new Curso[5];

        curso[0] = new Curso("POO","El curso más bonito",15,2);
        curso[1] = new Curso("Cálculo diferencial e integral","Empieza a rezarle al de arriba",15,2);

        curso[0].agregarPersonas(estudiante[0]);
        curso[0].agregarPersonas(estudiante[1]);
        curso[0].agregarPersonas(estudiante[2]);
        curso[0].agregarPersonas(estudiante[3]);
        curso[0].agregarPersonas(estudiante[4]);
        curso[0].agregarPersonas(estudiante[5]);
        curso[0].agregarPersonas(estudiante[6]);
        curso[1].agregarPersonas(estudiante[0]);
        curso[1].agregarPersonas(estudiante[1]);
        curso[1].agregarPersonas(estudiante[2]);
        curso[1].agregarPersonas(estudiante[3]);
        curso[1].agregarPersonas(estudiante[4]);
        curso[1].agregarPersonas(estudiante[5]);
        

        for (Estudiantes est : estudiante) {
            System.out.println(est);
        }
        for (Curso cur : curso) {
            System.out.println(cur);
        }

    }


    public static void main(String[] args) {

        (new Main()).run();
    }
}
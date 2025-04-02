import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Asignatura> asignaturasAprobadas;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignaturasAprobadas = new ArrayList<>();
    }

    public void agregarAsignaturaAprobada(Asignatura ... asignaturas) {
        Collections.addAll(this.asignaturasAprobadas, asignaturas);
    }

    public Boolean asignaturaAprobada(Asignatura unaAsignatura) {
        return this.asignaturasAprobadas.contains(unaAsignatura);
    }


}

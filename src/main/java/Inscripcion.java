import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private List<Asignatura> asignaturas;
    private Alumno alumno;

    public Inscripcion(Alumno alumno) {
        this.asignaturas = new ArrayList<>();
        this.alumno = alumno;
    }

    public void agregarAsignatura(Asignatura unaAsignatura) {
        this.asignaturas.add(unaAsignatura);
    }

    public boolean aprobada() {
        return asignaturas
                .stream()
                .allMatch(asignatura ->
                        asignatura.tieneCorrelativasAprobadasPor(this.alumno)
                );
    }
}

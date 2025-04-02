import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asignatura {
    private String nombre;
    @Getter
    private List<Asignatura> correlativas;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public void agregarCorrelativas(Asignatura ... asignaturas){
        Collections.addAll(this.correlativas, asignaturas);
    }

    public Boolean tieneCorrelativasAprobadasPor(Alumno alumno) {
       return this.correlativas
                .stream()
                .allMatch(correlativa ->
                    alumno.asignaturaAprobada(correlativa)
                );
    }
}

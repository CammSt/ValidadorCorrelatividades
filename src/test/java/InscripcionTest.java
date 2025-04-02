import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InscripcionTest {

    @Test
    public void inscripcionAprobadaConUnaMateria(){

        Alumno alumno = new Alumno("Camila", "Stahl");
        Inscripcion inscripcion = new Inscripcion(alumno);

        Asignatura dsi = new Asignatura("DSI");
        Asignatura paradigmas = new Asignatura("Paradigmas de Programación");
        Asignatura analisisDeSistemas = new Asignatura("Análisis de Sistemas");
        Asignatura algoritmos = new Asignatura("Algoritmos y Estructuras de Datos");

        dsi.agregarCorrelativas(paradigmas, analisisDeSistemas, algoritmos);

        alumno.agregarAsignaturaAprobada(paradigmas, analisisDeSistemas, algoritmos);

        inscripcion.agregarAsignatura(dsi);
        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionNoAprobadaConUnaMateria(){

        Alumno alumno = new Alumno("Camila", "Stahl");
        Inscripcion inscripcion = new Inscripcion(alumno);

        Asignatura dsi = new Asignatura("DSI");
        Asignatura paradigmas = new Asignatura("Paradigmas de Programación");
        Asignatura analisisDeSistemas = new Asignatura("Análisis de Sistemas");
        Asignatura algoritmos = new Asignatura("Algoritmos y Estructuras de Datos");

        dsi.agregarCorrelativas(paradigmas, analisisDeSistemas, algoritmos);

        alumno.agregarAsignaturaAprobada(paradigmas, analisisDeSistemas);

        inscripcion.agregarAsignatura(dsi);
        Assertions.assertFalse(inscripcion.aprobada());
    }
}
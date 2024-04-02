package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public void aprobacionInscripcion(){

        Materia algoritmos = new Materia("Algoritmos ", "AyED");
        Materia paradigmas = new Materia("Paradigmas","PdeP");
        Materia disenio = new Materia ("Diseño", "DDS");

        paradigmas.agregarMateriasNecesariasParaCursar(algoritmos);
        disenio.agregarMateriasNecesariasParaCursar(paradigmas);

        Alumno unAlumno = new Alumno("JMM", "Juan Manuel Menes");

        unAlumno.agregarMateriasAprobadas(algoritmos,paradigmas);

        Inscripcion unaInscripcion = new Inscripcion("IJMM", unAlumno);
        unaInscripcion.agregarMaterias(disenio);

        Assert.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void rechazoInscripcionPorNoTenerMateriaNecesaria(){

        Materia algoritmos = new Materia("Algoritmos ", "AyED");
        Materia paradigmas = new Materia("Paradigmas","PdeP");
        Materia disenio = new Materia ("Diseño", "DDS");

        paradigmas.agregarMateriasNecesariasParaCursar(algoritmos);
        disenio.agregarMateriasNecesariasParaCursar(paradigmas);

        Alumno unAlumno = new Alumno("JMM", "Juan Manuel Menes");

        unAlumno.agregarMateriasAprobadas(algoritmos);

        Inscripcion unaInscripcion = new Inscripcion("IJMM", unAlumno);
        unaInscripcion.agregarMaterias(disenio);

        Assert.assertFalse(unaInscripcion.aprobada());
    }

}

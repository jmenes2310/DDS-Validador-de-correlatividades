package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private String codigo;
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(String nombre, Alumno alumno) {
        this.codigo = nombre;
        this.alumno = alumno;
        this.materias =new ArrayList<>();
    }

    public String getNombre() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.codigo = nombre;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materias, materias);
    }

    public boolean aprobada(){
        return this.materias.stream().allMatch(unaMateria -> this.alumno.puedeCursar(unaMateria));
    }
}

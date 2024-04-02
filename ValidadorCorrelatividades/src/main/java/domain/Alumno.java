package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Alumno {
    private String codigo;
    private String nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean puedeCursar(Materia unaMateria){
        return new HashSet<>(this.materiasAprobadas).containsAll(unaMateria.getMateriasNecesariasParaCursar()) && !materiasAprobadas.contains(unaMateria);
    }
}

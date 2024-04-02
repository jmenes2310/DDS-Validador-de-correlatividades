package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private String codigo;
    private List<Materia> materiasNecesariasParaCursar;

    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materiasNecesariasParaCursar = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Materia> getMateriasNecesariasParaCursar() {
        return materiasNecesariasParaCursar;
    }

    public void agregarMateriasNecesariasParaCursar(Materia ... materias) {
        Collections.addAll(this.materiasNecesariasParaCursar, materias);
    }

}

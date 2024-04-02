package Dominio;

import java.util.List;

public class Materia {
    private String nombre;
    private List <Materia> corelativas;

    public List<Materia> getCorelativas() {
        return corelativas;
    }

    public Materia(String nombre, List<Materia> corelativas) {
        this.nombre = nombre;
        this.corelativas = corelativas;
    }
}

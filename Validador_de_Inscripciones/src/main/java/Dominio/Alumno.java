package Dominio;

import java.util.List;

public class Alumno {
    private int legajo;
    private List <Materia> aprobadas;


    public boolean puedeCursar(Materia unaMateria){
        return this.aprobadas.containsAll(unaMateria.getCorelativas()) || unaMateria.getCorelativas().isEmpty();
    }

    public Alumno(int legajo, List<Materia> aprobadas) {
        this.legajo = legajo;
        this.aprobadas = aprobadas;
    }
}

package Dominio;

import java.util.List;

public class Inscripcion {
    private Alumno estudiante;
    private List <Materia> materias;

    public boolean aprobada(){
    return this.materias.stream().allMatch(unaMateria-> this.estudiante.puedeCursar(unaMateria));
    }

    public Inscripcion(Alumno estudiante, List<Materia> materias) {
        this.estudiante = estudiante;
        this.materias = materias;
    }
}

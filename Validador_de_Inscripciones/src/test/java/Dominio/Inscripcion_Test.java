package Dominio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion_Test {
    @Test
    public void inscripcion_Algoritmo() {
        Materia algoritmo = new Materia("Algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("Paradigma", List.of(algoritmo));

        Alumno bruno = new Alumno(2037440, List.of());

        Inscripcion primeraInscripcion = new Inscripcion(bruno, List.of(algoritmo));


        Assertions.assertTrue(primeraInscripcion.aprobada());
    }

    @Test
    public void inscripcion_Disenio() {
        Materia algoritmo = new Materia("Algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("Paradigma", List.of(algoritmo));
        Materia disenio = new Materia("Diseño", List.of(paradigma));

        Alumno bruno = new Alumno(2037440, List.of(algoritmo, paradigma));

        Inscripcion primeraInscripcion = new Inscripcion(bruno, List.of(disenio));


        Assertions.assertTrue(primeraInscripcion.aprobada());
    }

    @Test
    public void inscripcion_Disenio_Fisica2() {
        Materia algoritmo = new Materia("Algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("Paradigma", List.of(algoritmo));
        Materia disenio = new Materia("Diseño", List.of(paradigma));
        Materia fisica = new Materia("Fisica", new ArrayList<Materia>());
        Materia fisica2 = new Materia("Fisica2", List.of(fisica));

        Alumno bruno = new Alumno(2037440, List.of(algoritmo, paradigma, fisica));

        Inscripcion primeraInscripcion = new Inscripcion(bruno, List.of(disenio, fisica2));


        Assertions.assertTrue(primeraInscripcion.aprobada());
    }

    @Test
    public void noPuedeInscribirseParadigma() {
        Materia algoritmo = new Materia("Algoritmo", new ArrayList<Materia>());
        Materia paradigma = new Materia("Paradigma", List.of(algoritmo));
        Materia disenio = new Materia("Diseño", List.of(paradigma));

        Alumno bruno = new Alumno(2037440, List.of());

        Inscripcion primeraInscripcion = new Inscripcion(bruno, List.of(paradigma));


        Assertions.assertFalse(primeraInscripcion.aprobada());
    }
}

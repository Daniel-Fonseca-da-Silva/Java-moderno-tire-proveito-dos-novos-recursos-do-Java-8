package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Ruby", 95));
        cursos.add(new Curso("Java", 317));
        cursos.add(new Curso("Golang", 251));
        cursos.add(new Curso("TypeScript", 561));
        cursos.add(new Curso("C++", 50));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 250)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(sum);
    }
}

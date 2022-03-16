package br.com.alura;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ExercicioDefault {

    public static void main(String[] args) {

        List<String> cursos = new LinkedList<>();

        cursos.add("Java");
        cursos.add("Golang");
        cursos.add("Ruby");
        cursos.add("C++");
        cursos.add("TypeScrit");
        cursos.add("Spring boot");
        cursos.add("JPA e Hibernate");
        cursos.add("Docker");

        cursos.forEach(System.out::println);

        cursos.sort(Comparator.comparing(String::length));

        System.out.println(cursos);

        new Thread(() -> System.out.println("Executando uma Runnable")).start();

    }

}

package br.com.alura;

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

        cursos.forEach(consumidor -> System.out.println(consumidor));

        cursos.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(cursos);

        new Thread(() -> System.out.println("Executando uma Runnable")).start();

    }

}

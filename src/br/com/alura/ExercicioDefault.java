package br.com.alura;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

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

        Consumer<String> consumidor = new Consumidor();
        cursos.forEach(consumidor);

        Comparador comparador = new Comparador();

        cursos.sort(comparador);
        System.out.println(cursos);

    }

}

class Comparador implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        if(s1.length() < s2.length()) return -1;
        if (s1.length() > s2.length()) return 1;
        return 0;
    }
}

class Consumidor implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

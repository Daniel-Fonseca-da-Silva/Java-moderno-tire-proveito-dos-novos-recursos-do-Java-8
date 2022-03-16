package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

//        Compara tamanho do menor para o maior!!!

        palavras.add("Digital Innovation one");
        palavras.add("Alura online");
        palavras.add("Udemy");

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));


        System.out.println(palavras);

        Function<String, Integer> funcao = String::length;
        Function<String, Integer> funcao2 = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);

        palavras.forEach(System.out::println);

    }

}


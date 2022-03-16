package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura online");
        palavras.add("Digital Innovation one");
        palavras.add("Udemy");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(palavras);

        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);

        palavras.forEach(s -> System.out.println(s));

    }

}


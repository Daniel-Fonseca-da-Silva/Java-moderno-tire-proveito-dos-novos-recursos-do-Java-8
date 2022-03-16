package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Alura online");
        palavras.add("Digital Innovation one");
        palavras.add("Udemy");

        Comparator<String> comparador = new ComparadorPorTamanho();
        palavras.sort(comparador);
        System.out.println(palavras);
//
//        for (String p : palavras) {
//            System.out.println(p);
//        }

        Consumer<String> consumidor = new ImprimeNaLinha();

        palavras.forEach(consumidor);

    }

}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) {
            return -1;
        }
        if(s1.length() > s1.length()) {
            return 1;
        }
        return 0;
    }
}

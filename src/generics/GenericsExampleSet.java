package generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {
    public static void main(String[] args) {
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);

        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 2");
        conjuntoGenerics.add("Elemento 3");

        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }

        for (Object elemento : conjuntoSemGenerics) {
            System.out.println(elemento.toString());
        }
    }
}

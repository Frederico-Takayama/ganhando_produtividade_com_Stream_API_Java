package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Desafio7 {
    //- Desafio 7 - Encontrar o segundo número maior da lista:

    //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

    public static void main(String[] args) {
        desafio7();
    }

    private static void desafio7() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().max((n1,n2) -> n1.compareTo(n2)).get());
    }
}

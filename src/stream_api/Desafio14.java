package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio14 {
    //- Desafio 14 - Encontre o maior número primo da lista:

    //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

    public static void main(String[] args) {
        desafio14();
    }

    private static void desafio14() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().max((n1, n2) -> n1.compareTo(n2)).get());
    }
}

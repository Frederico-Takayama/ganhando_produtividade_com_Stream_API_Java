package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio12 {
    //- Desafio 12 - Encontre o produto de todos os números da lista:

    //Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

    public static void main(String[] args) {
        desafio12();
    }

    private static void desafio12() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().reduce(1, (n1, n2) -> n1 * n2));
    }
}

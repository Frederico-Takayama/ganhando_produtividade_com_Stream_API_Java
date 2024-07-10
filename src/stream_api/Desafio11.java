package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio11 {
    //- Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:

    //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

    public static void main(String[] args) {
        desafio11();
    }

    private static void desafio11() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().map(n -> n*n).reduce(0, (n1, n2) -> n1 + n2));
    }
}

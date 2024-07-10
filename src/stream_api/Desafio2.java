package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio2 {
    // - Desafio 2 - Imprima a soma dos números pares da lista:

    // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

    public static void main(String[] args) {
        desafio2();
    }

    private static void desafio2() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer total = numeros.stream().filter(n -> n%2 == 0).reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(total);
    }
}

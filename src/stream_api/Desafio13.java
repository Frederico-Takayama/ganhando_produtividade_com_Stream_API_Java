package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio13 {
    //- Desafio 13 - Filtrar os números que estão dentro de um intervalo:

    //Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

    public static void main(String[] args) {
        desafio13();
    }

    private static void desafio13() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter(n -> n >= 5 && n <= 10).forEach(System.out::println);
    }
}

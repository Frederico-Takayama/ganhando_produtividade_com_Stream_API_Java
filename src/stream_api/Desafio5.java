package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio5 {

    // - Desafio 5 - Calcule a média dos números maiores que 5:

    // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

    public static void main(String[] args) {
        desafio5();
    }

    private static void desafio5() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.format("%.2f\n",
            numeros.stream().reduce(0, (n1, n2) -> n1 + n2).doubleValue()/numeros.size()
        );
    }
}

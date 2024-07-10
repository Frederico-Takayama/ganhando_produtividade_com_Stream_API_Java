package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Desafio3 {
    //Desafio 3 - Verifique se todos os números da lista são positivos:

    // Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

    public static void main(String[] args) {
        desafio3();
    }

    private static void desafio3() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().allMatch(n -> n >0));
    }
}

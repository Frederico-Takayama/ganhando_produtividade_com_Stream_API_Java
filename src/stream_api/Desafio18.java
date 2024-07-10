package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio18 {
    //- Desafio 18 - Verifique se todos os números da lista são iguais:

    //Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

    public static void main(String[] args) {
        desafio18();
    }

    private static void desafio18() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().distinct().toList().size() == 1);
    }
}

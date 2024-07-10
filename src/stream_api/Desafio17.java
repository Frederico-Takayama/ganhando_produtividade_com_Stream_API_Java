package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Desafio17 {
    //- Desafio 17 - Filtrar os números primos da lista:

    //Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

    public static void main(String[] args) {
        desafio17();
    }

    private static void desafio17() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // obs.: um numero primo é divisivel somente por 1 e ele mesmo; 0 e 1 não são primos
        numeros.stream().filter(n -> isPrimo(n)).forEach(System.out::println);

    }

    private static boolean isPrimo(Integer n) {
        boolean isPrimo = true;
        if(n < 2) {
            isPrimo = false;
        }            
        else {
            for(int i=2; i<n; i++) {
                if (n%i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }        
        return isPrimo;
    }
}

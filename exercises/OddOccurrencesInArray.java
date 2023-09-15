package exercises;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public static int oddOccurrencesInArray() {

        int[] exA = {999999999, 1000000000, 1000000000, 999999999, 888888888, 555555555, 888888888};
        System.out.printf(
                " O array de entrada de exemplo 'A' foi: %s.%n E  o valor do elemento não pareado é: %d.%n",
                Arrays.toString(exA), solution(exA));

        return solution(exA);
    }

    public static int solution(int[] A) {
        int response = 0;
        for (int element : A) { // Percorrendo cada elemento do array "A"
            response ^= element; // Aplicando a operação XOR entre "response" e o elemento atual do array "A"
        }

        return response;
    }

}

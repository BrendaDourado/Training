package exercises;

import java.util.Arrays;

public class CyclicRotation {

    public static int[] cyclicRotation() { // Criando um método de exemplo para aplicar a solution() que foi criada logo abaixo.
        int[] exA = {3, 8, 9, 7, 6};
        int exK = 3;
        int[] exSolution = solution(exA, exK);
        System.out.printf(
                " O array de entrada de exemplo 'A' foi: %s.%n O número de vezes a ser rotacionado 'K' foi: %d.%n E o array depois de rotacionado ficou assim: %s.%n",
                Arrays.toString(exA),  exK, Arrays.toString(exSolution));
        return exSolution;
    }

    public static int[] solution(int[] A, int K) {//criando o método de solução do case em questão

        int N = A.length; //armazeno na variavel N o tamanho do array;
        int[] arrayRotacionado = new int[N]; //criando um novo array de mesmo tamanho de 'A';

        for (int i = 0; i < N; i++) {
            int indiceRotacionado = (i + K) % N;  // Dentro de um loop, Calculando o novo índice de cada dado após a rotação;
            arrayRotacionado[indiceRotacionado] = A[i];  // Colocar o elemento no índice rotacionado;
        }

        //(para este caso tomei a decisão de implementar com loop explicito acima por questão de legibilidade do código)
        //deixo abaixo comentado outra forma de solução caso preferisse um loop implícito:

//        arrayRotacionado = IntStream.range(0, N)
//                .mapToObj(i -> A[(i - K % N + N) % N]) // Calcula o novo índice após a rotação e obtém o elemento
//                .mapToInt(Integer::intValue) // Converte para um array de int
//                .toArray();

        return arrayRotacionado;
    }

}

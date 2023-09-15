package exercises;

import java.util.*;

public class BinaryGap {
    public static Integer binaryGapTest() {
        Integer response = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("insira N aqui:"); //'N' é um número inteiro dentro do intervalo [ 1..2.147.483.647 ] .
        int N = sc.nextInt(); // Aqui eu recebo 'N' do usuário.
        String bin = Integer.toBinaryString(N); //Aqui eu pego o Binario de 'N'.

        String nBinary = bin.replaceAll("0+$", "");//removendo 0's no fim do numero (pois o gapBinary precisa ser de zeros entre numeros 1)
        List<String> listBinaryGaps = List.of(nBinary.split(String.valueOf(1)));//cortando 'nBinary' em toda recorrencia do numero 1, gerando uma lista dos gaps binarios;

        if(!listBinaryGaps.isEmpty()) { //validando que a lista não está vazia.
            response = listBinaryGaps.stream().max(Comparator.comparing(String::length)).get().length();//usando o stream para percorar a lista comparando pelo length de cada uma e pegando a de maior length armazenando o lenght dela em 'response'
        }


// deixo abaixo outra forma de solução caso preferisse um loop explicito:

//        for (String str : listBinaryGaps) {
//            int comprimentoAtual = str.length();
//            if (comprimentoAtual > response) {
//                response = comprimentoAtual;
//            }
//        }

        System.out.println(response);

        return response;
    }

}


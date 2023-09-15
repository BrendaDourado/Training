package exercises;


public class FrogJump {

    public static int frogJump() {
        int exX = 10;
        int exY = 85;
        int exD = 30;

        System.out.printf(
                " Os dados de entrada de exemplo foram (posição atual) 'X': %d.%n Posição minima final: %d.%n Distancia de cada pulo: %d.%n E o resutado de quantos pulos serão necessários é de %d.%n",
                exX, exY, exD, solution(exX, exY, exD));
        return solution(exX, exY, exD);

    }

    public static int solution(int X, int Y, int D) {
        int distance = Y - X;
        int jumps = distance/D;

        if(distance % D !=0){
            jumps++;
        }

        return jumps;
    }
}

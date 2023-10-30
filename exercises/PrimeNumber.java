package exercises;

public class PrimeNumber {
    String checkIsPrime(Integer n) {
        String response = " ";

        if (n == 2) {
            return response = "Is prime";
        }
        if (EvenNumber.checkEven(n)) {
            return response = "Isn't a prime";
        }
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return response = "Isn't a prime";
            }
            return response = "Is prime";
        }
        return response;
    }
}

import java.util.*;

public class PrimeFibo {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to generate first N prime numbers
    public static ArrayList<Integer> generatePrimes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int num = 2;  // Start checking from 2
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    // Function to generate first N Fibonacci numbers
    public static ArrayList<Integer> generateFibonacci(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            fibonacci.add(a);
            int next = a + b;
            a = b;
            b = next;
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        ArrayList<Integer> primes = generatePrimes(N);
        ArrayList<Integer> fibonacci = generateFibonacci(N);

        // Print the sequence in alternating order
        for (int i = 0; i < N; i++) {
            System.out.print(primes.get(i) + " " + fibonacci.get(i) + " ");
        }
    }
}

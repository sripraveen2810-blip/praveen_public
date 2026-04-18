import java.math.BigInteger;

/*
 * Name: praveen
 * Email: sripraveen2810@gmail.com
 */
public class Factorial {
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Factorial <non-negative integer>");
            return;
        }

        int number = Integer.parseInt(args[0]);
        if (number >= 100) {
            System.out.println("Please provide a number less than 100.");
            return;
        }
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}

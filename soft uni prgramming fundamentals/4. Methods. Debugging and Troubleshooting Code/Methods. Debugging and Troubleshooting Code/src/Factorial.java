import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = Long.parseLong(s.nextLine());
        PrintFactorial(n);
    }
    //methods

    static void PrintFactorial(long n) {
        BigInteger sum = new BigInteger("1");
        for (long i = 1; i <= n; i++) {
            sum=sum.multiply(BigInteger.valueOf(i));

        }
        System.out.println(sum);
    }
}

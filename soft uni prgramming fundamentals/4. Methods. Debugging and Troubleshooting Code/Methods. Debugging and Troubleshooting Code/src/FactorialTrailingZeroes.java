import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());
        BigInteger sum = getBigInteger(number);
        PrintZero(sum);
    }
//methods




    private static void PrintZero(BigInteger sum) {
        String bigIntegerValue =sum.toString();
        int count = 0;

        while (bigIntegerValue.length()>1){
            char zero = bigIntegerValue.charAt(bigIntegerValue.length()-1);
            if(zero=='0'){
                count++;
            }else{
                break;
            }
            bigIntegerValue=bigIntegerValue.substring(0,bigIntegerValue.length()-1);
        }


        System.out.println(count);
    }




    static BigInteger getBigInteger(int number) {


        BigInteger sum = new BigInteger("1");
        for (long i = 1; i <= number; i++) {
            sum=sum.multiply(BigInteger.valueOf(i));


        }
        return sum;
    }
}



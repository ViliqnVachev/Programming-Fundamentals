import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long number=Long.parseLong(s.nextLine());
        boolean result=IsPrime(number);
        Print(result);

    }

    //methods

    static boolean IsPrime(long n){
        boolean isPrime=true;
        long temp=0;
            if(n<=1){
                return isPrime=false;
            }else{
            for (long i = 2; i <= Math.sqrt(n); i++) {
                temp=n%i;
                if (temp==0){
                    isPrime=false;
                    break;
                }
            }
            }

        return isPrime;
    }
   static void Print(boolean b){
        String a = Boolean.toString(b);
         char first= a.toUpperCase().charAt(0);

        System.out.println(first+a.substring(1));

   }
}

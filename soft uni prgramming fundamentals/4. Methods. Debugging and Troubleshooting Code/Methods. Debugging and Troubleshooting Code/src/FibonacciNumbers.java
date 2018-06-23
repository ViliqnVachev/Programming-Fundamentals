import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n =Long.parseLong(s.nextLine());
        PrintFibonaci(n);

    }




    //methods

    static void PrintFibonaci(long n ){
        long result=1;
        long temp=0;
        for (int i = 0; i < n; i++) {

            result=result+temp;
            temp=result-temp;
        }
        System.out.println(result);

}
}

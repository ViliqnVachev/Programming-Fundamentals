import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());
        int result=GetMultipleOfEvensAndOdds(n);
        System.out.println(result);


    }

    //methods

    static int GetSumOfEvenDigits(int n){

        int sum = 0;
        while (n>0){
           int temp=0;
           temp=n%10;
           if(temp%2==0){
               sum=sum+temp;
           }
           n=n/10;
        }
        return sum;
    }

    static int GetSumofOddDigits(int n ){
        int sum = 0;
        while (n>0){
            int temp=0;
            temp=n%10;
            if(temp%2!=0){
                sum=sum+temp;
            }
            n=n/10;
        }
        return sum;
    }
    static int GetMultipleOfEvensAndOdds(int n ){
        n=Math.abs(n);
        int sumEven=GetSumOfEvenDigits(n);
        int sumOdd=GetSumofOddDigits(n);
        int result=sumEven*sumOdd;
        return result;
    }
}

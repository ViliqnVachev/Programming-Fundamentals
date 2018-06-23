import java.util.Scanner;

public class SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number =Integer.parseInt(s.nextLine());
        PrintSign(number);

    }

    //methods

    static void PrintSign(int number){
        if(number>0){
            System.out.printf("The number %d is positive.",number);
        } else if(number == 0){
            System.out.printf("The number %d is zero.",number);
        }else {
            System.out.printf("The number %d is negative.",number);
        }
    }

}

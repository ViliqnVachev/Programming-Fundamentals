import java.util.Scanner;

public class NumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        PrintReversNumber(number);
    }

    //mothods

    static void PrintReversNumber(String name){
        String revers= new StringBuffer(name).reverse().toString();
        System.out.println(revers);
    }
}

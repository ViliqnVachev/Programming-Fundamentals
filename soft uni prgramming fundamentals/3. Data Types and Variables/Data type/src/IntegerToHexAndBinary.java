import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());
        String hex=Integer.toHexString(number).toUpperCase();
        String bin= Integer.toBinaryString(number);

        System.out.println(hex);
        System.out.println(bin);


    }
}

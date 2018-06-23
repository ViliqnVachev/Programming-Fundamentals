import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = Long.parseLong(s.nextLine());
        n=Math.abs(n);
        String name = NameOfLastDigit(n);
        System.out.println(name);
    }
    //methods

    static String NameOfLastDigit(long n) {
        long lastDigit = LastDigit(n);
        String name = "";
        if (lastDigit == 1) {
            name = "one";
        } else if (lastDigit == 2) {
            name = "two";
        } else if (lastDigit == 3) {
            name = "three";
        } else if (lastDigit == 4) {
            name = "four";
        } else if (lastDigit == 5) {
            name = "five";
        } else if (lastDigit == 6) {
            name = "six";
        } else if (lastDigit == 7) {
            name = "seven";
        } else if (lastDigit == 8) {
            name = "eight";
        } else if (lastDigit == 9) {
            name = "nine";
        } else if (lastDigit == 0) {
            name = "zero";
        }



        return name;
}


    static long LastDigit(long n) {

        long lastDigit = Math.abs(n) % 10;
        return lastDigit;
    }
}

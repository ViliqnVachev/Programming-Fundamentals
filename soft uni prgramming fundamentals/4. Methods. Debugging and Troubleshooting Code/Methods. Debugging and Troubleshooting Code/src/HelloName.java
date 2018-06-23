import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        PrintName(name);

    }

    //methdos

    static void PrintName(String name){
        System.out.printf("Hello, %s!",name);
    }
}

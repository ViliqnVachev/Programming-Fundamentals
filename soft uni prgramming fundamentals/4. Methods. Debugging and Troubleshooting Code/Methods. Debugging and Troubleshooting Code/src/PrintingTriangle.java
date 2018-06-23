import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());
        PrintTriangleOfNumbers(n);
    }
    // methods


    static void PrintTriangleOfNumbers (int n){

        PrintTop(n);
        PrintBottom(n);
    }

    private static void PrintBottom(int n) {
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private static void PrintTop(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

}

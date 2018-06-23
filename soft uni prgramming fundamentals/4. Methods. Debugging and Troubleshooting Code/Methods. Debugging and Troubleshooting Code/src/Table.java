import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner s=  new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(row+col);
            }
            System.out.println();
        }
    }
}

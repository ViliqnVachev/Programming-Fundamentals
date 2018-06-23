import java.util.Scanner;

public class DrawAFilledSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        PrintFigures(n);

    }


    //methods

    static void PrintFigures(int n){
        PrintFirstAndLastPart(n);
        PrintMiddlePart(n);
        PrintFirstAndLastPart(n);


    }


    static void PrintFirstAndLastPart(int n){

        for (int row = 0; row <2*n ; row++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void PrintMiddlePart(int n ){
        for (int i = 0; i <n-2 ; i++) {
            System.out.print("-");
            for (int row = 0; row < n-1; row++) {
                System.out.print("\\/");
            }
            System.out.println("-");
        }


    }


}

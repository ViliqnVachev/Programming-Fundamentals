import java.util.Scanner;

public class MaxMethod {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a =Integer.parseInt(s.nextLine());
        int b =Integer.parseInt(s.nextLine());
        int c =Integer.parseInt(s.nextLine());

        int resulte=GetMax(a,b,c);
        System.out.println(resulte);

    }
    //methods

    static int GetMax (int a, int b , int c){
        int result=GetMax(a,b);
        if(result>c){
            return result;
        }else{
            return c;
        }
    }

    static int GetMax (int a , int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}

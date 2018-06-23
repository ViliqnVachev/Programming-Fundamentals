
import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String type=s.nextLine();

        switch (type){
            case "int":
                int a=Integer.parseInt(s.nextLine());
                int b=Integer.parseInt(s.nextLine());
                int result =GetMax(a,b);
                System.out.println(result);
                break;
            case "char":
                char c=s.next().charAt(0);
                char d=s.next().charAt(0);
                char result2=GetMax(c,d);
                System.out.println(result2);

                break;
            case "string":
                String e=s.nextLine();
                String f=s.nextLine();
                String result3=GetMax(e,f);
                System.out.println(result3);

                break;
        }


    }


    //methods
    static int GetMax (int a,int b){

        if(b>a){
            return  b;
        }else{
            return a;
        }

    }
    static char GetMax(char a, char b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    static String GetMax (String a ,String b){
        if(a.compareTo(b)>=0){
            return a;
        }else{
            return b;
        }
    }
}

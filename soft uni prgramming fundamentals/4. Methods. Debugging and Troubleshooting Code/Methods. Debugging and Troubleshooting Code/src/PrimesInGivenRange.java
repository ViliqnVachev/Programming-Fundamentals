import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimesInGivenRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list= new ArrayList<Integer>();
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        list=GetListOfPrime(a,b);

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i));
            if(i<list.size()-1){
                System.out.print(", ");

            }
        }
    }
    //methods

    static List GetListOfPrime(int a, int b){
        List<Integer> list= new ArrayList<Integer>();
        int temp=0;
        for (int i = a; i <= b; i++ )
        {
            boolean isPrime = true;
            if (i<2)
            {
                isPrime = false;
            }
            for (int j = 2; j <i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                list.add(i);
            }
        }




        return list;
    }
}

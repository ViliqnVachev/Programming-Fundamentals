import java.util.Scanner;

public class MasterNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());
        IsPalindrome(n);
    }
    //methods

    static void IsPalindrome (int n){
        for (int i = 0; i < n; i++) {
            int sum= 0;
            int temp=i;
            int r;
            while (temp>0){
                r=temp%10;
                sum=(sum*10)+r;
                temp=temp/10;
                if(sum==i){
                    SumOfDiites(i);
                }
            }
        }

    }
    static void SumOfDiites (int n){
        int sum =0;
        int temp=0;
        int r=n;
        while (r>0){
            temp=r%10;
            sum=sum+temp;
            r=r/10;

        }
        if (sum%7==0){
                ContainsEvenDigits(n);
        }
    }

    static void ContainsEvenDigits (int n){
        int even =0;
        int temp=n;
        while (temp>0){
            even=temp%10;
            if(even%2==0){
                System.out.println(n);
                break;
            }
                temp=temp/10;

        }
    }
}

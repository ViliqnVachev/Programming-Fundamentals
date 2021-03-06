import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());


        for (int i = 1; i <= number; i++)
        {
            int sum = 0;
           int current = i;
            while (current > 0)
            {
                sum += current % 10;
                current = current / 10;
            }



            boolean condition = (sum == 5 || sum == 7 || sum == 11);
            //ternary in java
            System.out.format(condition ? "%d -> True%n" : "%d -> False%n", i);
        }
}
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num=Double.parseDouble(s.nextLine());
        double number =Double.parseDouble(s.nextLine());
        double result= ReisToPow(num,number);
        DecimalFormat df =new DecimalFormat("#.##########");
        System.out.println(df.format(result));
    }


    //methods

    static double ReisToPow(double num,double powe){
        return Math.pow(num,powe);

    }




}
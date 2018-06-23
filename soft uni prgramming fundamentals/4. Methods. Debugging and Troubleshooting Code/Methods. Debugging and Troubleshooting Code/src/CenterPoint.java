import java.text.DecimalFormat;
import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = Double.parseDouble(s.nextLine());
        double b = Double.parseDouble(s.nextLine());
        double c = Double.parseDouble(s.nextLine());
        double d = Double.parseDouble(s.nextLine());
        PrintCenterPoint(a, b, c, d);
    }

    //methods
    static void PrintCenterPoint(double a, double b, double c, double d) {


        double firstDistance=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double secondDistance=Math.sqrt(Math.pow(c,2)+Math.pow(d,2));
        DecimalFormat df =new DecimalFormat("###.############");

        if(firstDistance<secondDistance){
            System.out.printf("(%s, %s)",df.format(a),df.format(b));
        }else {
            System.out.printf("(%s, %s)",df.format(c),df.format(d));
        }

    }
}

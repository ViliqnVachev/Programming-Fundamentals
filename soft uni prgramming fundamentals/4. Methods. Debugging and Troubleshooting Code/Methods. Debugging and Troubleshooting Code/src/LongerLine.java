import java.text.DecimalFormat;
import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = Double.parseDouble(s.nextLine());
        double b = Double.parseDouble(s.nextLine());
        double c = Double.parseDouble(s.nextLine());
        double d = Double.parseDouble(s.nextLine());
        double a1 = Double.parseDouble(s.nextLine());
        double b1 = Double.parseDouble(s.nextLine());
        double c1 = Double.parseDouble(s.nextLine());
        double d1 = Double.parseDouble(s.nextLine());

        DecimalFormat df =new DecimalFormat("###.############");

        printLongerLine(a,b,c,d,a1,b1,c1,d1);


    }
    //methods

    static double lineLength (double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    static double distanceToCenter(double x, double y)
    {
        return Math.sqrt(Math.pow((0 - x), 2) + Math.pow((0 - y), 2));
    }

    static void printClosestPointFirst(double x1, double y1, double x2, double y2)
    {
        DecimalFormat df =new DecimalFormat("###.############");
        if (distanceToCenter(x1, y1) > distanceToCenter(x2, y2))
        {
            System.out.printf("(%s, %s)" , df.format(x2), df.format(y2));
            System.out.printf("(%s, %s)" , df.format(x1), df.format(y1));
        }
        else
        {
            System.out.printf("(%s, %s)",df.format(x1),df.format(y1));
            System.out.printf("(%s, %s)",df.format(x2),df.format(y2));
        }
    }

    static void printLongerLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        if (lineLength(x1, y1, x2, y2) >= lineLength(x3, y3, x4, y4))
        {
            printClosestPointFirst(x1, y1, x2, y2);
        }
        else if (lineLength(x1, y1, x2, y2) < lineLength(x3, y3, x4, y4))
        {
            printClosestPointFirst(x3, y3, x4, y4);
        }
    }
    }
import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String type = s.nextLine();

        switch (type){
            case "triangle":
                double a =Double.parseDouble(s.nextLine());
                double b =Double.parseDouble(s.nextLine());
                double result=GetTranleArea(a,b);
                System.out.printf("%.2f",result);
                break;
            case "square":
                double a1 = Double.parseDouble(s.nextLine());
                double result1=GetSquareArea(a1);
                System.out.printf("%.2f",result1);
                break;
            case "rectangle":
                double a2 =Double.parseDouble(s.nextLine());
                double b2 =Double.parseDouble(s.nextLine());
                double result2=GetRectangleArea(a2,b2);
                System.out.printf("%.2f",result2);
                break;
            case "circle":
                double a3 = Double.parseDouble(s.nextLine());
                double result3=GetCircleArea(a3);
                System.out.printf("%.2f",result3);
                break;
        }
    }

    //methods
    //Triangle Area
    static double GetTranleArea(double a, double b) {
        double result=(a*b)/2;
        return result;
    }

    //Square Area
    static double GetSquareArea(double a){
        double result=a*a;
        return result;
    }

    //Rectangle Area
    static double GetRectangleArea (double a, double b){
        double result=(a*b);
        return result;
    }

    //Circle Area
    static double GetCircleArea (double r){
        double result=Math.PI*r*r;
        return result;
    }


}

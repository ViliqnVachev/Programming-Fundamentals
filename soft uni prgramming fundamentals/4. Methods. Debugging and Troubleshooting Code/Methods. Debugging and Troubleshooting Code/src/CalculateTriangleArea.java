import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df =new DecimalFormat("##########.#############");
        double width = Double.parseDouble(s.nextLine());
        double height = Double.parseDouble(s.nextLine());
        double area = TriangleArea(width,height);
        System.out.println(df.format(area));
    }

    //methods
    static double TriangleArea(double width, double height){
        double area=(width*height)/2;
        return area;
    }




}

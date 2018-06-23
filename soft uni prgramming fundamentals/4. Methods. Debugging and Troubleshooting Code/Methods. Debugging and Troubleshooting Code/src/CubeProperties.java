import java.util.Scanner;

public class CubeProperties {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = Double.parseDouble(s.nextLine());
        String type= s.nextLine();
        PrintResultOfCube(type,n);

    }
    //methods

    //face
    static double GetFace(double n) {

        double face = Math.sqrt(2 * Math.pow(n, 2));
        return face;
    }

    //sapace
    static double GetSpace(double n) {

        double space = Math.sqrt(3 * Math.pow(n, 2));
        return space;
    }

    //volume
    static double GetVolume(double n) {
        double volume = Math.pow(n, 3);
        return volume;
    }

    //area
    static double GetArea(double n) {
        double area = 6 * Math.pow(n, 2);
        return area;
    }

    //Print the result method
    static void PrintResultOfCube(String type, double n) {
        double result = 0;
        switch (type) {
            case "face":
                result = GetFace(n);
                break;
            case "space":
                result = GetSpace(n);
                break;
            case "volume":
                result = GetVolume(n);
                break;
            case "area":
                result = GetArea(n);

                break;
        }
        System.out.printf("%.2f",result);
    }


}

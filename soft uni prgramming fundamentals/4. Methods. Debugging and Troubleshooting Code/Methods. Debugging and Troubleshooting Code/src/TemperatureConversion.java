import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fahrenheit=Double.parseDouble(s.nextLine());
        double celsium=FahrenheitToCelsium(fahrenheit);
        System.out.printf("%.2f",celsium);
    }

    // methods

    static double FahrenheitToCelsium(double fahrenheit){

        double celsium=(fahrenheit-32)*5/9;
        return celsium;
    }
}

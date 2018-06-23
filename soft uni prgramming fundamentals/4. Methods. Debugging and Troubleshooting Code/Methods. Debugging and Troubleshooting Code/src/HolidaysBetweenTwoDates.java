/*
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HolidaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Date startDate = new Date(s.nextLine());
        SimpleDateFormat ft =new SimpleDateFormat("dd.MM.yyyy");

        Date endDate = new Date(s.nextLine());

        int holidaysCount = 0;
        for (Date date = startDate; date <= endDate; date.a(1))
            if (date.DayOfWeek == DayOfWeek.Saturday &&
                    date.DayOfWeek == DayOfWeek.Sunday) holidaysCount++;
        Console.WriteLine(holidaysCount);
    }
}
*/

using System;
using System.Text.RegularExpressions;

namespace MatchDates
{
    class MatchDates
    {
        static void Main(string[] args)
        {
            string inputDate = Console.ReadLine();
            string pattern = @"\b(?<day>\d{2})([-.\/])(?<month>[A-Z][a-z]{2})\1(?<year>\d{4})\b";
            var match = Regex.Matches(inputDate, pattern);

            foreach (Match item in match)
            {
                Console.WriteLine($"Day: {item.Groups["day"].Value}, Month: {item.Groups["month"].Value}, Year: {item.Groups["year"].Value}");
            }
        }
    }
}

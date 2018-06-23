using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace MatchPhoneNumber
{
    class MatchPhoneNumber
    {
        static void Main(string[] args)
        {
            string patern = @"\+359(?<sep>[-| ])[2](\k<sep>)[\d]{3}(\k<sep>)[\d]{4}\b";
            string phones = Console.ReadLine();

            var phonenumbers = Regex.Matches(phones, patern);
            var matchPhone = phonenumbers.Cast<Match>().Select(a => a.Value.Trim()).ToArray();
            Console.WriteLine(string.Join(", ",matchPhone));
        }
    }
}

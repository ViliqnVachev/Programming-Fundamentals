using System;
using System.Text.RegularExpressions;

namespace ExtractEmails
{
    class ExtractEmails
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string patern = @"(^|(?<=\s))[a-z0-9]+[-\._]?[a-z0-9]+@[a-z]+[-]?[a-z]*[\.]?[a-z]*[.][a-z]+";

            var match = Regex.Matches(input, patern);

            foreach (Match item in match)
            {
                Console.WriteLine(item.Value);
            }
        }
    }
}

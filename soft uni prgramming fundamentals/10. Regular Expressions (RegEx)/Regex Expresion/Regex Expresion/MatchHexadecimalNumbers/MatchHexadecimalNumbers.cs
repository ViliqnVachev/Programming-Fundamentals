using System;
using System.Text.RegularExpressions;

namespace MatchHexadecimalNumbers
{
    class MatchHexadecimalNumbers
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string pattern = @"\b(?:0x)?[0-9A-F]+\b";
            var match = Regex.Matches(input, pattern);

            foreach (var item in match)
            {
                Console.Write(item+" ");
            }
            Console.WriteLine();
        }
    }
}

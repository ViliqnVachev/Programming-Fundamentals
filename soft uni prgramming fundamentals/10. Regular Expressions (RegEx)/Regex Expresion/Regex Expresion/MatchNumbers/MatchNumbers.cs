using System;
using System.Text.RegularExpressions;

namespace MatchNumbers
{
    class MatchNumbers
    {
        static void Main(string[] args)
        {
            string inputNumber = Console.ReadLine();
            string pattern = @"(^|(?<=\s))-?\d+(\.\d+)?($|(?=\s))";
            var match = Regex.Matches(inputNumber, pattern);

            foreach (Match item in match)
            {
                Console.Write(item.Value+" ");
            }
            Console.WriteLine();
        }
    }
}

using System;
using System.Text.RegularExpressions;

namespace MatchFullName
{
    class MatchFullName
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string patern = @"\b[A-Z][a-z]+ [A-Z][a-z]+\b";
            MatchCollection matches = Regex.Matches(input, patern);

            foreach (Match name in matches)
            {
                Console.Write(name.Value+" ");
            }
            Console.WriteLine();
        }
    }
}

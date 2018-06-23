using System;
using System.Text.RegularExpressions;

namespace OnlyLetters
{
    class OnlyLetters
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string patern = @"\d+";

            var match = Regex.Matches(input, patern);

            foreach (Match item in match)
            {
                if (input.EndsWith(item.Value))
                {
                    break;
                }
                int index = input.LastIndexOfAny(item.Value.ToCharArray());
                string replace = input[index + 1].ToString();
                input = input.Replace(item.Value,replace );
            }
            Console.WriteLine(input);
        }
    }
}

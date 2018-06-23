using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace ExtractSentencesByKeyword
{
    class ExtractSentencesByKeyword
    {
        static void Main(string[] args)
        {
            string word = Console.ReadLine();
            string [] input = Console.ReadLine().Split(new char []{'.','?','!'},StringSplitOptions.RemoveEmptyEntries).ToArray();
            string patern = $@"\b{word}\b";

            for (int i = 0; i < input.Length; i++)
            {
                if (Regex.IsMatch(input[i], patern))
                {
                    Console.WriteLine(input[i].Trim());
                }
            }
        }
    }
}

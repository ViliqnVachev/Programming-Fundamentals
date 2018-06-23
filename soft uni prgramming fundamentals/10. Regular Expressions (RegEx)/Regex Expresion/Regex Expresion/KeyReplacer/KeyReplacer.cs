using System;
using System.Text;
using System.Text.RegularExpressions;

namespace KeyReplacer
{
    class KeyReplacer
    {
        static void Main(string[] args)
        {
            string paternInput = Console.ReadLine();
            string patern = @"([A-Za-z]+)([\|<\\])(.*)([\|<\\])([A-Za-z]+)";
            Match match = Regex.Match(paternInput, patern);
            string start =match.Groups[1].Value;
            string end = match.Groups[5].Value;
                     
            string text = Console.ReadLine();
            string paternText = $@"({start})(.*?)({end})";

            var matches = Regex.Matches(text, paternText);

            StringBuilder sb = new StringBuilder();
            foreach (Match item in matches)
            {
                sb.Append(item.Groups[2].Value);
            }
            if (sb.Length == 0)
            {
                Console.WriteLine("Empty result");
            }
            else
            {

            Console.WriteLine(sb);
            }
        }
    }
}

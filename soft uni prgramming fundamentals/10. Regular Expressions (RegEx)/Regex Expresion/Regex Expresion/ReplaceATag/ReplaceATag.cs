using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace ReplaceATag
{
    class ReplaceATag
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string patern = @"<a.*?href.*?=(.*)>(.*)<\/a>";
            
            string replace = @"[URL href=$1]$2[/URL]";
            List<string> output = new List<string>();
            while (input != "end")
            {
                if (Regex.IsMatch(input, patern) == false)
                {
                    output.Add(input);
                    input = Console.ReadLine();
                    continue;
                }

                var match1=Regex.Replace(input, patern, replace);
                output.Add(match1);
                input = Console.ReadLine();
            }
            foreach (var item in output)
            {
                Console.WriteLine(item);
            }
        }
    }
}

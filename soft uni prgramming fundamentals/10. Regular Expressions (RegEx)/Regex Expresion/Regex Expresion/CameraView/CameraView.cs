using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace CameraView
{
    class CameraView
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();
            int skip = numbers[0];
            int take = numbers[1];

            string text = Console.ReadLine();
            string patern = @"(\|<)(?<skip>[\w]{"+skip+@"})(?<take>[\w]{0,"+take+@"})";

            MatchCollection match = Regex.Matches(text, patern);
            List<string> output = new List<string>();
            foreach (Match item in match)
            {
                output.Add(item.Groups["take"].Value);
            }
            Console.WriteLine(string.Join(", ",output));
        }
    }
}

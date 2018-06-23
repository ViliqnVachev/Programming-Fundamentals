using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace MorseCodeUpgraded
{
    class MorseCodeUpgraded
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string patern = @"([0-1]+)";
            List<char> decodet = new List<char>();

            var match = Regex.Matches(input, patern);
            foreach (Match item in match)
            {
                int sum = 0;
                int helpSum = 0;
                char[] temp = item.Value.ToCharArray();
                int tempSum = 1;
                int count1 = 0;
                int count0 = 0;
                for (int i = 0; i <temp.Length-1 ; i++)
                {
                    if (temp[i] == '0')
                    {
                        count0++;
                    }
                    else
                    {
                        count1++;
                    }
                    if (temp[i] == temp[i + 1])
                    {
                        tempSum++;
                        if (tempSum >= 2)
                        {
                        helpSum = tempSum;

                        }
                      
                    }
                    else
                    {
                        sum += helpSum;
                        tempSum = 1;
                        helpSum = 0;
                    }
                }
                if (temp[temp.Length-1] == '0')
                {
                    count0++;
                }
                else
                {
                    count1++;
                }
                sum += helpSum;
                count0 = count0 * 3;
                count1 = count1 * 5;
                sum = sum + count0 + count1;
                decodet.Add((char)sum);
            }
            Console.WriteLine(string.Join("",decodet));
        }
    }
}

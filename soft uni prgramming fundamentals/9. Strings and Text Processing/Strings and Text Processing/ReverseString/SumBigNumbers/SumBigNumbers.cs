using System;
using System.Linq;
using System.Numerics;
using System.Text;

namespace SumBigNumbers
{
    class SumBigNumbers
    {
        static void Main(string[] args)
        {
            string first = Console.ReadLine();
            string second= Console.ReadLine();
            if (first.Length > second.Length)
            {
                second = second.PadLeft(first.Length, '0');
            }
            else
            {
                first = first.PadLeft(second.Length, '0');
            }

            StringBuilder result = new StringBuilder();
            int sum = 0;
            int reminder = 0;
            for (int i = first.Length-1; i >=0; i--)
            {
                int a = int.Parse(first[i].ToString());
                int b = int.Parse(second[i].ToString());
                sum = a + b+reminder;
                if (sum > 9)
                {
                    sum = sum % 10;
                    reminder = 1;
                    result.Append(sum);
                }
                else
                {
                    reminder = 0;
                    result.Append(sum);
                }
            }

            if (reminder == 1)
            {
                result.Append(reminder);
            }
           char[]final= result.ToString().TrimEnd('0').Reverse().ToArray();
            Console.WriteLine(final);
        }
    }
}

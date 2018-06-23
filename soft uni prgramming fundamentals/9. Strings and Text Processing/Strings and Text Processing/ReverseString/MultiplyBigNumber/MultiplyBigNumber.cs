using System;
using System.Linq;
using System.Text;

namespace MultiplyBigNumber
{
    class MultiplyBigNumber
    {
        static void Main(string[] args)
        {
            string first = Console.ReadLine();
            int second = int.Parse(Console.ReadLine());
            if (second == 0)
            {
                Console.WriteLine(second);
                return;
            }
            int sum = 0;
            int reminder = 0;
            StringBuilder result = new StringBuilder();

            for (int i = first.Length-1; i >=0 ; i--)
            {
                int a = int.Parse(first[i].ToString());
                sum = a * second + reminder;

                if (sum > 9)
                {
                    reminder = sum / 10;
                    sum = sum % 10;
                    result.Append(sum);
                }
                else
                {
                    reminder = 0;
                    result.Append(sum);
                }
            }
            if (reminder > 0)
            {
                result.Append(reminder);
            }

            char[] final = result.ToString().TrimEnd('0').Reverse().ToArray();
            Console.WriteLine(final);
        }
    }
}

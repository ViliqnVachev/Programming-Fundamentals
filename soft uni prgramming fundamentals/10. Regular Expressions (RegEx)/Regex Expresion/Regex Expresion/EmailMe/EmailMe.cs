using System;
using System.Linq;

namespace EmailMe
{
    class EmailMe
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split('@').ToArray();
            string befor = input[0];
            string after = input[1];
            int sumBefor = 0;
            int sumafter = 0;

            for (int i = 0; i <befor.Length; i++)
            {
                sumBefor += befor[i];
            }
            for (int i = 0; i < after.Length; i++)
            {
                sumafter += after[i];
            }
            if (sumBefor - sumafter >= 0)
            {
                Console.WriteLine("Call her!");
            }
            else
            {
                Console.WriteLine("She is not the one.");
            }
        }
    }
}

using System;
using System.Linq;

namespace ReverseString
{
    class ReverseString
    {
        static void Main(string[] args)
        {
            string words = Console.ReadLine();

            char[] revers = words.ToCharArray();
            revers = revers.Reverse().ToArray();

            Console.WriteLine(revers);
        }
    }
}

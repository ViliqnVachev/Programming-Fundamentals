using System;
using System.Linq;

namespace MagicExchangeableWords
{
    class MagicExchangeableWords
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split().ToArray();
            char[] word1 = input[0].ToCharArray();
            char[] word2 = input[1].ToCharArray();
           
           word1= word1.Distinct().ToArray();
           word2= word2.Distinct().ToArray();

            if (word1.Length == word2.Length)
            {
                Console.WriteLine("true");
            }
            else
            {
                Console.WriteLine("false");
            }
        }
    }
}

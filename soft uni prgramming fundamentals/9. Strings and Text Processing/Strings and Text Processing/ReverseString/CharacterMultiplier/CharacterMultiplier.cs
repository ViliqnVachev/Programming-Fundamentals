using System;
using System.Linq;

namespace CharacterMultiplier
{
    class CharacterMultiplier
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split().ToArray();
            string word1 = input[0];
            string word2 = input[1];
            long sum = 0;
            for (int i = 0; i < Math.Min(word1.Length,word2.Length); i++)
            {
                sum += word1[i] * word2[i];
            }
            if (word1.Length > word2.Length)
            {
                for (int i = Math.Min(word1.Length, word2.Length); i < word1.Length; i++)
                {
                    sum += word1[i];
                }
            }
            else
            {
                for (int i = Math.Min(word1.Length, word2.Length); i < word2.Length; i++)
                {
                    sum += word2[i];
                }
            }
            Console.WriteLine(sum);
        }
    }
}

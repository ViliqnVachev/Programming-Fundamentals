using System;
using System.Collections.Generic;
using System.Linq;

namespace Palindromes
{
    class Palindromes
    {
        static void Main(string[] args)
        {
            string[] words = Console.ReadLine().Split(new char[] { '?', ',', '!', '.', ' ' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            List<string> palindrome = new List<string>();

            for (int i = 0; i < words.Length; i++)
            {
                char[] temp= words[i].ToCharArray();
                temp = temp.Reverse().ToArray();
                string revers = "";

                for (int k = 0; k < temp.Length; k++)
                {
                    revers += temp[k];
                }

                for (int j = 0; j < words.Length; j++)
                {
                    if (revers == words[j])
                    {
                        palindrome.Add(words[j]);
                    }
                }
            }

            palindrome = palindrome.Distinct().ToList();
            palindrome = palindrome.OrderBy(x => x).ToList();

            Console.WriteLine(string.Join(", ",palindrome));
        }
    }
}

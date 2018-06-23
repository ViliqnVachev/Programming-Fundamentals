using System;
using System.Linq;

namespace CountSubstringOccurrences
{
    class CountSubstringOccurrences
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine().ToLower();
            string tem = Console.ReadLine().ToLower();
            int index = -1;
            int counter = 0;

            while (true)
            {
                index = text.IndexOf(tem, index + 1);
                if (index == -1)
                {
                    break;
                }
                else
                {
                    counter++;
                }
            }
            Console.WriteLine(counter);
        }
    }
}

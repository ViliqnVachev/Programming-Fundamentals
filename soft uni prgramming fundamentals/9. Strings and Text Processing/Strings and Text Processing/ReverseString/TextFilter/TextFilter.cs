using System;
using System.Linq;

namespace TextFilter
{
    class TextFilter
    {
        static void Main(string[] args)
        {
            string[] badWords = Console.ReadLine().Split(new char[] {',',' ' },StringSplitOptions.RemoveEmptyEntries).ToArray();
            string text = Console.ReadLine();

            foreach (var bad in badWords)
            {
                text = text.Replace(bad, new string('*', bad.Length));
            }
            Console.WriteLine(text);
        }
    }
}

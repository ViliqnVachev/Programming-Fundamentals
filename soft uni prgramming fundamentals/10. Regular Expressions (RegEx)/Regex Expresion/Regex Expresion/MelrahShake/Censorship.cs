using System;
using System.Text.RegularExpressions;

namespace Censorship
{
    class Censorship
    {
        static void Main(string[] args)
        {
            string patern = Console.ReadLine();
            string text = Console.ReadLine();

            for (int i = 0; i < text.Length; i++)
            {
                text = text.Replace(patern, new string('*', patern.Length));
            }
            Console.WriteLine(text);
        }
    }
}

﻿using System;

namespace UnicodeCharacters
{
    class UnicodeCharacters
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();

            foreach (var item in text)
            {
                Console.Write("\\u{0:x4}",(int) item);
            }
            Console.WriteLine();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace ValidUsernames
{
    class ValidUsernames
    {
        static void Main(string[] args)
        {
            string[] users = Console.ReadLine().Split(new char[] { ' ', '/', '\\','(',')' },StringSplitOptions.RemoveEmptyEntries).ToArray();
            string patern = @"(^[A-Za-z][\w]{2,24})";

            List<string> validUsers = new List<string>();

            for (int i = 0; i < users.Length; i++)
            {
                if (Regex.IsMatch(users[i], patern))  //&& users[i].Length>=3 && users[i].Length<=25) ??????? W H Y
                {
                    validUsers.Add(users[i]);
                }
            }

            int sum = 0;
            int position = 0;
            for (int i = 0; i < validUsers.Count-1; i++)
            {
                if (validUsers[i].Length + validUsers[i + 1].Length > sum)
                {
                    sum = validUsers[i].Length + validUsers[i + 1].Length;
                    position = i;
                }
                
            }

            for (int i = 0; i <2 ; i++)
            {
                Console.WriteLine(validUsers[position+i]);
            }
        }
    }
}

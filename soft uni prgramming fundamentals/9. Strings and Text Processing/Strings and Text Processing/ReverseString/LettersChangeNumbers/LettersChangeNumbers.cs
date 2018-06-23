using System;
using System.Linq;
using System.Numerics;

namespace LettersChangeNumbers
{
    class LettersChangeNumbers
    {
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(new char[] { ' ','\t' }, StringSplitOptions.RemoveEmptyEntries).ToArray();

            double num = 0;

            double result = 0;
            
                for (int i = 0; i < input.Length; i++)
                {
                    double sum = 0;
                    string number = "";
                    char[] chars = input[i].ToCharArray();
                    for (int j = 1; j < chars.Length - 1; j++)
                    {
                        number += chars[j];
                    }
                    num = double.Parse(number);
                    if (chars[0] >= 'A' && chars[0] <= 'Z')
                    {
                        sum = num / (chars[0] - 64);
                    }
                    else if (chars[0] >= 'a' && chars[0] <= 'z')
                    {
                        sum = num * (chars[0] - 96);
                    }
                    if (chars[chars.Length - 1] >= 'A' && chars[chars.Length - 1] <= 'Z')
                    {
                        sum = sum - (chars[chars.Length - 1] - 64);
                    }
                    else if (chars[chars.Length - 1] >= 'a' && chars[chars.Length - 1] <= 'z')
                    {
                        sum = sum + (chars[chars.Length - 1] - 96);
                    }
                    result += sum;

                }
                Console.WriteLine("{0:f2}", result);
            }
           
            }

    }


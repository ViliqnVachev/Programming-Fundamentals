using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Weather
{
    class Weather
    {
        static void Main(string[] args)
        {
          string input=Console.ReadLine();

            Dictionary<string, Dictionary<double, string>> info = new Dictionary<string, Dictionary<double, string>>();
            while (input != "end")
            {
                string patern = @"([A-Z]{2})([0-5]{2}\.[0-5]{1,2})([A-za-z]+)\|";
                MatchCollection match = Regex.Matches(input, patern);

                if (Regex.IsMatch(input,patern)==false)
                {
                    input = Console.ReadLine();
                    continue;
                }

                string city = "";
                string temp = "";
                string weather = "";
                foreach (Match item in match)
                {
                    city = item.Groups[1].Value;
                    temp = item.Groups[2].Value;
                    weather = item.Groups[3].Value;
                }
                double temperature = double.Parse(temp);
                string tempweth = weather.ToLower();
              
                if (info.ContainsKey(city) == false)
                {
                    var helper = new Dictionary<double, string>();
                    helper.Add(temperature, weather);
                    info.Add(city, helper);
                }
                else
                {
                    info[city].Clear();
                    info[city].Add(temperature, weather);
                }
                input = Console.ReadLine();
            }
            foreach (var item in info.OrderBy(x=>x.Value.Keys.Average()))
            {
                Console.Write($"{item.Key} => {item.Value.Keys.Average():f2} => ");
                foreach (var weath in item.Value)
                {
                    Console.WriteLine($"{weath.Value}");
                }
            }
        }
    }
}

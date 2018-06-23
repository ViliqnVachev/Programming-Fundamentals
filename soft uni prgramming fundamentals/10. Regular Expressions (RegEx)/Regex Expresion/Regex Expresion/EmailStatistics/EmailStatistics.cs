using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace EmailStatistics
{
    class EmailStatistics
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string pattern = @"^(?<username>[a-zA-Z]{5,})@(?<domain>(?<mailServer>[a-z]{3,})(?<topDomain>\.com|\.bg|\.org))$";
            Dictionary<string, List<string>> info = new Dictionary<string, List<string>>();
            // MatchCollection match;
            List<string> temp = new List<string>();
            for (int i = 0; i < n; i++)
            {
                string data = Console.ReadLine();
                Match match = Regex.Match(data, pattern);
                string user = "";
                string domein = "";
                if (match.Success)
                {
                    user = match.Groups["username"].Value;
                    domein= match.Groups["domain"].Value;
                    if (info.ContainsKey(domein) == false)
                    {
                        List<string> help = new List<string>();
                        
                        info[domein]= help;
                    }
                    if(info[domein].Contains(user)==false)
                    {

                    info[domein].Add(user);
                    }
                }
                
            }

            foreach (KeyValuePair<string, List<string>> item in info.OrderByDescending(x=>x.Value.Count))
            {
                string domain = item.Key;
                List<string> usernames = item.Value;
                Console.WriteLine($"{domain}:");
                foreach (var user in usernames)
                {
                    Console.WriteLine($"### {user}");
                }
            }
           
        }
    }
}

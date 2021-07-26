using System;
using OpenQA.Selenium.Chrome; // import this
using System.Threading;

namespace IntroSelenium
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            ChromeDriver driver = new ChromeDriver();
            driver.Url = "https://aspnetcoremaster.com";
            Thread.Sleep(2000);
            driver.Close();
        }
    }
}
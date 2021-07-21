package com.testing_demo;

import org.testng.annotations.Test;
//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
   @Test
   public void driverExcercise() {
      //String str = "TestNG is working fine";
      //assertEquals("TestNG is working fine", str);

      ///workspaces/curly-funicular/drivers_selenium/chromedriver.exe ONLY Windows
      System .setProperty("webdriver.chrome.driver", "/workspaces/curly-funicular/drivers_selenium/chromedriver");
      WebDriver driver = new ChromeDriver();
      
      driver.get("wwww.google.com");
      assert driver.getTitle().startsWith("Google");
      driver.quit();
   }
}

package com.testing_demo;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
   @Test
   public void driverExcercise() {
      String str = "TestNG is working fine";
      assertEquals("TestNG is working fine", str);

      System .setProperty("webdriver.chrome.driver", ".\\web_drivers_general\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.get("wwww.google.com");
      assert driver.getTitle().startsWith("Google");
      driver.quit();
   }
}

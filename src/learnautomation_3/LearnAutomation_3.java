/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_3;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     
          System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
          
          WebDriver driver = new FirefoxDriver();
          
          driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
          
          List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
          
          for(int i=0;i<radio.size();i++)
          {
             WebElement local_radio= radio.get(i);
             String value=local_radio.getAttribute("value");
             System.out.println("Values from radio Buttons are ==>"+value);
             
              
          }
          driver.quit();

    }
    
}

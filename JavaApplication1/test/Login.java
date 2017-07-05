/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 *
 * @author Vladimir.Klimenko
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver = null;
           
            
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\AT\\chromedriver.exe");
    
            
        driver = new	ChromeDriver();
        //driver = new	FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://maxymizely.com");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.id("SignIn_Email")).sendKeys(property.getProperty('email'));
                
        driver.findElement(By.id("SignIn_Password")).sendKeys("qwerty");
        driver.findElement(By.id("buttonLogIn")).click();
         if (driver.getTitle().equals("Эксперименты"))
    System.out.println("OK");
else
    System.out.println("Error");
             	driver.quit();
   	        // TODO code application logic here
    }

    private void open(String httpsmaxymizelycom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
test new modify

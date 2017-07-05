package signupfb;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir.Klimenko
 */
public class SignUpFB {
    private static WebDriver driver = null;
    
     public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\AT\\chromedriver.exe");
         driver = new	ChromeDriver();
        //driver = new	FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://maxymizely.com");
        driver.get("https://visitdev.maxymizely.com/");
        driver.findElement(By.id("SignUpBtn")).click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#SignUpPopUp > div.signup_popup > div.signup_wrap > div.su_right > div > form > button.button.fb_su")).click();
        driver.findElement(By.id("email")).sendKeys("clim@ukr.net");
        driver.findElement(By.id("pass")).sendKeys("19Jkmuf66");
        driver.findElement(By.id("loginbutton")).click();
        	if (!"Добро пожаловать!".equals(driver.getTitle())) {
                throw new IllegalStateException("Sign UP by FB is failed");}
       //driver.textShouldBeDisplayed("Welcome to Maxymizely!")
        driver.quit();
}

    private static void click() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


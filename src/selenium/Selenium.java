package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("Java tutorial");
        driver.findElement(By.xpath(".//*[@id='sblsbb']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[2]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        driver.findElement(By.xpath(".//*[@id='rso']/div/div[1]/div/h3/a")).click();
        
        System.exit(0);
        
        System.out.println("sadfasdfasdfasdfasdf");

    }

}

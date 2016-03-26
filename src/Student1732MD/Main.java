package Student1732MD;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author 1732MD
 */
public class Main {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);

        driver.get("https://accounts.google.com/signup");
        driver.manage().window().maximize();

        driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
        System.out.println(driver.getTitle());

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

    }
}

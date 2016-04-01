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
public class MainClass {

    public static void main(String[] args) {
//        SeleniumClass sc = new SeleniumClass();
//        JavaClass jc = new JavaClass();

        int number1 = 0, number2 = 1, number3;
        Integer a;
        String asdf;
        System.out.print(number1 + " " + number2);

        for (int i = 2; i < 15; i++)
        {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }

    }
}

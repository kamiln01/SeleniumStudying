import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {
    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        driver.findElement(By.xpath("//button[@id='clickOnMe']"));

        driver.findElement(By.xpath("//input[@name='fname']"));

        driver.findElement(By.xpath("//p[@class='topSecret']"));

        driver.findElement(By.xpath("//input"));

        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("First input");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println("Number of inputs on website: " + inputs.size());

        driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        driver.findElement(By.xpath("//a[contains(text(),'Visit')]"));

        By partialLink = By.xpath("/html/body/div/ul");
        driver.findElement(partialLink);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        By allXpath = By.xpath("//*");
        driver.findElement(allXpath);

        By secondElement = By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        By lastElement = By.xpath("(//input)[last()]");
        driver.findElement(secondElement);

        By elementWithAttribute = By.xpath("//*[@name]");
        driver.findElements(elementWithAttribute);

    }
}

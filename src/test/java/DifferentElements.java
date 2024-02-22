import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class DifferentElements {
    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

//        By buttonId = By.id("clickOnMe");
//        WebElement clickOnMeButton = driver.findElement(buttonId);
        driver.findElement(By.id("clickOnMe"));

//        By firstName = By.name("fname");
//        WebElement fnameName = driver.findElement(firstName);
        driver.findElement(By.name("fname"));

//        By className = By.className("topSecret");
//        WebElement classNameName = driver.findElement(className);
        driver.findElement(By.className("topSecret"));

        driver.findElement(By.tagName("input"));

        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println("Number of inputs on website: " + inputs.size());




    }
}

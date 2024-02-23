import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSssSelectorsTest {
    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#clickOnMe"));

        driver.findElement(By.cssSelector("label"));

        driver.findElement(By.cssSelector("input")).sendKeys("Found by 'input'. ");
        driver.findElement(By.cssSelector("#fname")).sendKeys("Found by '#fname'");

        driver.findElement(By.cssSelector("a"));

        driver.findElement(By.cssSelector("th.tableHeader"));

        driver.findElement(By.cssSelector("[type='text']"));

        driver.findElement(By.cssSelector("[class='topSecret']"));
    }
}

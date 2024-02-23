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

        By ulInDiv = By.cssSelector("div ul");
        By trInTable = By.cssSelector("table tr");
        By trInBody = By.cssSelector("tbody tr");

        driver.findElement(ulInDiv);
        driver.findElement(trInTable);
        driver.findElement(trInBody);

        By firstChildUlInDiv = By.cssSelector("div > ul");
        By firstChildTrInTbody = By.cssSelector("tbody > tr");

        driver.findElement(firstChildUlInDiv);
        driver.findElement(firstChildTrInTbody);

        By firstFormAfterLabel = By.cssSelector("label + form");
        By allFormAfterLabel = By.cssSelector("label ~ form");

        driver.findElement(firstFormAfterLabel);
        driver.findElement(allFormAfterLabel);
    }
}

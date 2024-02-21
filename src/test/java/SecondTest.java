import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
        // znalezienie przycisku
        WebElement shopButton = driver.findElement(By.xpath("//span[text()='Shop']"));
        // klikniecie przycisku
        shopButton.click();
        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//h2[text()='Java Selenium WebDriver']"));
        Assert.assertTrue(result.isDisplayed());
        driver.quit();
    }

    public WebDriver getDriver(String browser) {
        return switch (browser) {
            case "chrome" -> new ChromeDriver();
            case "firefox" -> new FirefoxDriver();
            case "ie" -> new InternetExplorerDriver();
            default -> throw new IllegalArgumentException("unsupportedBrowserType: " + browser);
        };
    }
}

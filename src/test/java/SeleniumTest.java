import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Dimension windowSize = new Dimension(1000, 1000);
        driver.manage().window().setSize(windowSize);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.open('https://www.google.com','blank','height=500,width=500')");
        driver.close();
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

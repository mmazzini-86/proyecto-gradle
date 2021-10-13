package utilities;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;


public class Utilities {
    public static WebDriver driver;

    public static void inicializarChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mario\\Documents\\curso\\selenium-testng\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://banco.santander.cl/personas");
        driver.manage().window().maximize();

    }
    public static WebElement esperarElementoWebBci(String path)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
    }
    public static List<WebElement> esperarElementosWebListBci (String path)
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
        return driver.findElements(By.xpath(path));
    }
    public static void screenShotForAllScenario() throws Exception
    {
        Thread.sleep(2000);
        File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String folderPath = System.getProperty("user.dir")+"/reports/img/";
        File folder = new File(folderPath);
        folder.mkdir();
        File destinationPath = new File(folderPath + "imagen.png");
        Files.copy(sourcePath, destinationPath);
    }
}

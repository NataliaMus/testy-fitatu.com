package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FitatuFlex {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\natal\\IdeaProjects\\test\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://fitatu.com";

        driver.get(baseUrl);
        String xp = "//a[contains(text(),'Polska')]";

        WebElement idiomaSelect = driver.findElement(By.xpath("xp"));

        Actions actions = new Actions(driver);
        actions.moveToElement(idiomaSelect).perform();
        driver.findElement(By.linkText("United Kingdom")).click();

        driver.close();

    }
}
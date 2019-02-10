package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class buttonPraca {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\natal\\IdeaProjects\\test\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://fitatu.com";
        String expectedSite= "http://it.fitatu.com/praca/";
        String CurrentUrl = "";

        driver.get(baseUrl);
        driver.findElement(By.linkText("Praca")).click();
        driver.getCurrentUrl();

        if (CurrentUrl.contentEquals(expectedSite)){
            System.out.println("Test passed!");
        }else {
            System.out.println("Test failed");
        }
        driver.close();

    }
}
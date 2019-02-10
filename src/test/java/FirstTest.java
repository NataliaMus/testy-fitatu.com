import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\natal\\IdeaProjects\\test\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }
    @Test
    public void userRegistrationWithValidData() throws InterruptedException {
        WebElement signInButton = driver.findElement(By.cssSelector("[title=\"Log in to your customer account\"]"));
        signInButton.click();
        Thread.sleep(5000);

        WebElement emailInput = driver.findElement(By.id("email_create"));
        emailInput.sendKeys("natanatantsaq1w@pl.pl");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
        Thread.sleep(5000);

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Natalia");
        driver.findElement(By.id("customer_lastname")).sendKeys("Lalala");
        driver.findElement(By.id("passwd")).sendKeys("Lala123!");

        WebElement daysSelect = driver.findElement(By.id("days"));
        new Select(daysSelect).selectByValue("2");

        WebElement monthsSelect = driver.findElement(By.id("months"));
        new Select(monthsSelect).selectByValue("March");

        WebElement yearsSelect = driver.findElement(By.id("years"));
        new Select(yearsSelect).selectByValue("1994");




        driver.findElement(By.id("submitAccount")).click();
        Thread.sleep(5000);

        boolean isAlertDisplayed = driver.findElement(By.className("alert")).isDisplayed();
        Assert.assertTrue(isAlertDisplayed);

    }
    @After
    public void tearDown (){
        driver.quit();
    }

}
